package com.example.nonz.spaze;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PageLogin  extends AppCompatActivity implements View.OnClickListener {

    private final AppCompatActivity activity = PageLogin.this;

    private NestedScrollView nestedScrollView;

    private TextInputLayout textInputLayoutUsername;
    private TextInputLayout textInputLayoutPassword;

    private TextInputEditText textInputEditTextUsername;
    private TextInputEditText textInputEditTextPassword;

    private AppCompatButton appCompatButtonLogin;

    private AppCompatTextView textViewLinkRegister;

    private InputValidation inputValidation;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_login);
        getSupportActionBar().hide();

        initViews();
        initListeners();
        initObjects();
    }
    private void initViews(){
        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);

        textInputLayoutUsername = (TextInputLayout) findViewById(R.id.textInputLayoutUsername);
        textInputLayoutPassword = (TextInputLayout) findViewById(R.id.textInputLayoutPassword);


        textInputEditTextUsername = (TextInputEditText) findViewById(R.id.InputUsername);
        textInputEditTextPassword = (TextInputEditText) findViewById(R.id.InputPassword);


        appCompatButtonLogin = (AppCompatButton) findViewById(R.id.ButtonLogin);

        textViewLinkRegister = (AppCompatTextView) findViewById(R.id.LinkRegister);
    }

    private void initListeners(){
        appCompatButtonLogin.setOnClickListener(this);
        textViewLinkRegister.setOnClickListener(this);
    }

    private void initObjects(){
        databaseHelper = new DatabaseHelper(activity);
        inputValidation = new InputValidation(activity);
    }


    public void onClick(View v){
        switch (v.getId()){
            case R.id.ButtonLogin:
                verifyFromSQLite();
                break;
            case R.id.LinkRegister:
                Intent intentRegister = new Intent(getApplicationContext(), PageRegister.class);
                startActivity(intentRegister);
                break;
        }
    }

    private void verifyFromSQLite(){
        if (!inputValidation.isInputEditTextFilled(textInputEditTextUsername, textInputLayoutUsername, getString(R.string.error_message_email))) {
            return;
        }
        if (!inputValidation.isInputEditTextEmail(textInputEditTextUsername, textInputLayoutUsername, getString(R.string.error_message_email))) {
            return;
        }
        if (!inputValidation.isInputEditTextFilled(textInputEditTextPassword, textInputLayoutPassword, getString(R.string.error_message_email))) {
            return;
        }

        if (databaseHelper.checkUser(textInputEditTextUsername.getText().toString().trim()
                , textInputEditTextPassword.getText().toString().trim())) {
            Intent accountsIntent = new Intent(activity, MainActivity.class);
            accountsIntent.putExtra("EMAIL", textInputEditTextUsername.getText().toString().trim());
            emptyInputEditText();
            startActivity(accountsIntent);
        } else {
            Snackbar.make(nestedScrollView, getString(R.string.error_valid_email_password), Snackbar.LENGTH_LONG).show();
        }
    }

    private void emptyInputEditText(){
        textInputEditTextUsername.setText(null);
        textInputEditTextPassword.setText(null);
    }
}

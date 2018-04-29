package com.example.nonz.spaze;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



/*public class PageRegister extends AppCompatActivity {


    //DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_register);

    }

    public void onSignUpClick(View v)
    {
        if(v.getId()==R.id.signupBtn)
        {
            EditText name = (EditText)findViewById(R.id.name);
            EditText email = (EditText)findViewById(R.id.email);
            EditText uname = (EditText)findViewById(R.id.uname);
            EditText pass = (EditText)findViewById(R.id.pass);
            EditText repass = (EditText)findViewById(R.id.repass);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String passstr = pass.getText().toString();
            String repassstr = repass.getText().toString();

            if (!passstr.equals(repassstr))
            {
                Toast notpass = Toast.makeText(PageRegister.this, "Password don't match!", Toast.LENGTH_SHORT);
                notpass.show();
            }
            else
            {
                Contact c = new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(passstr);

                helper.addUser(c);
            }
        }
    }

    }*/
public class PageRegister extends AppCompatActivity implements View.OnClickListener {

    private final AppCompatActivity activity = PageRegister.this;

    private NestedScrollView nestedScrollView;

    private TextInputLayout textInputLayoutName;
    private TextInputLayout textInputLayoutuName;
    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutPassword;
    private TextInputLayout textInputLayoutConfirmPassword;

    private TextInputEditText name;
    private TextInputEditText uname;
    private TextInputEditText email;
    private TextInputEditText pass;
    private TextInputEditText repass;

    private AppCompatButton appCompatButtonRegister;
    private AppCompatTextView appCompatTextViewLoginLink;

    private InputValidation inputValidation;
    private DatabaseHelper databaseHelper;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_register);
        getSupportActionBar().hide();

        initViews();
        initListeners();
        initObjects();
    }

    private void initViews(){
        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);

        textInputLayoutName = (TextInputLayout) findViewById(R.id.textInputLayoutName);
        textInputLayoutuName = (TextInputLayout) findViewById(R.id.textInputLayoutuName);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
        textInputLayoutPassword = (TextInputLayout) findViewById(R.id.textInputLayoutPassword);
        textInputLayoutConfirmPassword = (TextInputLayout) findViewById(R.id.textInputLayoutrePassword);

        name = (TextInputEditText) findViewById(R.id.name);
        uname = (TextInputEditText) findViewById(R.id.uname);
        email = (TextInputEditText) findViewById(R.id.email);
        pass = (TextInputEditText) findViewById(R.id.pass);
        repass = (TextInputEditText) findViewById(R.id.repass);

        appCompatButtonRegister = (AppCompatButton) findViewById(R.id.appCompatButtonRegister);

        appCompatTextViewLoginLink = (AppCompatTextView) findViewById(R.id.appCompatTextViewLoginLink);
    }

    private void initListeners(){
        appCompatButtonRegister.setOnClickListener(this);
        appCompatTextViewLoginLink.setOnClickListener(this);
    }

    private void initObjects(){
        inputValidation = new InputValidation(activity);
        databaseHelper = new DatabaseHelper(activity);
        user = new User();
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.appCompatButtonRegister:
                postDataToSQLite();
                break;
            case R.id.appCompatTextViewLoginLink:
                finish();
                break;
        }
    }

    private void postDataToSQLite(){
        if (!inputValidation.isInputEditTextFilled(name, textInputLayoutName, getString(R.string.error_message_name))) {
            return;
        }
        if (!inputValidation.isInputEditTextFilled(uname, textInputLayoutuName, getString(R.string.error_message_name))) {
            return;
        }
        if (!inputValidation.isInputEditTextFilled(email, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }
        if (!inputValidation.isInputEditTextEmail(email, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }
        if (!inputValidation.isInputEditTextFilled(pass, textInputLayoutPassword, getString(R.string.error_message_password))) {
            return;
        }
        if (!inputValidation.isInputEditTextMatches(pass, repass,
                textInputLayoutConfirmPassword, getString(R.string.error_password_match))) {
            return;
        }

        if (!databaseHelper.checkUser(email.getText().toString().trim())) {

            user.setName(uname.getText().toString().trim());
            user.setEmail(email.getText().toString().trim());
            user.setPassword(pass.getText().toString().trim());

            databaseHelper.addUser(user);

            // Snack Bar to show success message that record saved successfully
            Snackbar.make(nestedScrollView, getString(R.string.success_message), Snackbar.LENGTH_LONG).show();
            emptyInputEditText();


        } else {
            // Snack Bar to show error message that record already exists
            Snackbar.make(nestedScrollView, getString(R.string.error_email_exists), Snackbar.LENGTH_LONG).show();
        }


    }

    private void emptyInputEditText(){
        name.setText(null);
        uname.setText(null);
        email.setText(null);
        pass.setText(null);
        repass.setText(null);
    }

}





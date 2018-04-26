package com.example.nonz.spaze;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class PageRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_register);
    }

    public void onSignUpClick(View v)
    {
        if (v.getId()==R.id.Bsignupbutton)
        {
            EditText name = (EditText)findViewById(R.id.signup_input_name);
            EditText email = (EditText)findViewById(R.id.signup_input_email);
            EditText uname = (EditText)findViewById(R.id.signup_input_username);
        }
    }
}

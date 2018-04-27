package com.example.nonz.spaze;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class PageRegister extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_register);
    }

    public void onSignUpClick(View v)
    {
        if (v.getId()==R.id.btn_signup)
        {
            EditText name = (EditText)findViewById(R.id.signup_input_name);
            EditText email = (EditText)findViewById(R.id.signup_input_email);
            EditText uname = (EditText)findViewById(R.id.signup_input_username);
            EditText pass = (EditText)findViewById(R.id.signup_input_layout_password);
            EditText repass = (EditText)findViewById(R.id.signup_input_layout_repassword);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String passstr = pass.getText().toString();
            String repassstr = repass.getText().toString();

            if(!passstr.equals(repassstr))
            {
                Toast msgpass = Toast.makeText(PageRegister.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                msgpass.show();
            }
            else
            {
                Contact c =new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(passstr);

                helper.insertContact(c);

            }

        }
    }
}

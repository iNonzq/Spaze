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


public class PageRegister extends AppCompatActivity {


    DatabaseHelper helper = new DatabaseHelper(this);
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

}


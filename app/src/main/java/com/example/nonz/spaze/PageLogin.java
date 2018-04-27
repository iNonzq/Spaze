package com.example.nonz.spaze;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class PageLogin  extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_login);

    }
    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.LoginButton)
        {
            EditText usr = (EditText)findViewById(R.id.editTextUsername);
            EditText pwd = (EditText)findViewById(R.id.editTextPassword);

            String usrstr = usr.getText().toString();
            String pwdstr = pwd.getText().toString();

            String password = helper.searchPass(usrstr);
            if(pwdstr.equals(password))
            {
                Intent i = new Intent(PageLogin.this, MainActivity.class);

            }
            else
            {
                Toast temp = Toast.makeText(PageLogin.this, "Username and Password don't match.", Toast.LENGTH_SHORT);
                temp.show();
            }
        }
    }
}

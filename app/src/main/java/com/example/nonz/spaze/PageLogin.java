package com.example.nonz.spaze;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataOutputStream;


public class PageLogin  extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_login);

    }


    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.loginBtn)
        {
            EditText a =(EditText)findViewById(R.id.usernameEditText);
            String str = a.getText().toString();

            String password = helper.searchPass(str);

            if(password.equals(password)) {
                Intent i = new Intent(PageLogin.this, PageSetting.class);
                i.putExtra("username", str);
                startActivity(i);
            }
            else
            {
                Toast temp = Toast.makeText(PageLogin.this, "Password don't match!", Toast.LENGTH_SHORT);
                temp.show();
            }
        }
    }

}
package com.example.nonz.spaze;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;


public class PageLogin  extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button LoginBtn, RegisBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_login);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        LoginBtn = findViewById(R.id.LoginButton);

    }
}

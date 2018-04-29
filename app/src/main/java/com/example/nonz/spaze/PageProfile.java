package com.example.nonz.spaze;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;


public class PageProfile extends AppCompatActivity{

    private TextView textWelcome;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_profile);
        setTitle(R.string.welcome);

        textWelcome = findViewById(R.id.name);
    }


}

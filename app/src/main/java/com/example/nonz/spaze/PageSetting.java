package com.example.nonz.spaze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageSetting extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_setting);


        b1 = (Button) findViewById(R.id.signupBtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(PageSetting.this,PageRegister.class);
                startActivity(A1);
            }
        });

        b2 = (Button) findViewById(R.id.loginBtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(PageSetting.this,PageLogin.class);
                startActivity(A1);
            }
        });

        String username = getIntent().getStringExtra("username");
    }
}



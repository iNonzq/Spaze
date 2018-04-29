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
                Intent B1 = new Intent(PageSetting.this, PageRegister.class);
                startActivity(B1);
            }
        });

        b2 = (Button) findViewById(R.id.LoginBtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2 = new Intent(PageSetting.this,PageLogin.class);
                startActivity(B2);
            }
        });

    }
}



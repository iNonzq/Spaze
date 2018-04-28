package com.example.nonz.spaze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageSetting extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_setting);


        button = (Button) findViewById(R.id.setting_login);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), PageLogin.class);
                startActivity(i);
            }
        });
    }
}


}

package com.example.nonz.spaze;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton a1,a2,a3,a4,a5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (ImageButton) findViewById(R.id.courseBtt);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(MainActivity.this,PageCourse.class);
                startActivity(A1);
            }
        });

        a2 = (ImageButton) findViewById(R.id.planetBtt);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A2 = new Intent(MainActivity.this,PagePlanet.class);
                startActivity(A2);
            }
        });

        a3 = (ImageButton) findViewById(R.id.mainBtt);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A3 = new Intent(MainActivity.this,PageFact.class);
                startActivity(A3);
            }
        });

        a4 = (ImageButton) findViewById(R.id.scheduleBtt);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A4 = new Intent(MainActivity.this,PageSchedule.class);
                startActivity(A4);
            }
        });

        a5 = (ImageButton) findViewById(R.id.setBtt);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A5 = new Intent(MainActivity.this,PageRegister.class);
                startActivity(A5);
            }
        });
    }
}

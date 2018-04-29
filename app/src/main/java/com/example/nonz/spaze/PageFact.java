package com.example.nonz.spaze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageFact extends AppCompatActivity {

    Button SButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_fact);
        SButton1 = (Button)findViewById(R.id.SButton);
        SButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Space officially begins at the universal marker of the Karman Line. This invisible boundary is 100 km above the Earth. In theory if you could drive your car upwards, you could be in space in less than hour.";
                String shareSub = "Space is not far away.";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent,"Share using"));
            }
        });

    }
}

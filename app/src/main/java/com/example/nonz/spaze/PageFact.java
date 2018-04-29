package com.example.nonz.spaze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageFact extends AppCompatActivity {

    Button SButton1,SButton2,SButton3,SButton4,SButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_fact);
        SButton1 = (Button)findViewById(R.id.SButton1);
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

        SButton2 = (Button)findViewById(R.id.SButton2);
        SButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Uranus appears to be a featureless blue ball upon first glance, but this gas giant of the outer solar system is pretty weird upon closer inspection. First, the planet rotates on its... More details in Spaze";
                String shareSub = "Uranus is tilted on its side";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent,"Share using"));
            }
        });

        SButton3 = (Button)findViewById(R.id.SButton3);
        SButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "This is tricky one to get your head around but a year on Venus (that is the length of time it takes to complete one full orbit around the Sun) is 224.7 Earth days. However it takes 243 Earth days ... More details in Spaze";
                String shareSub = "On Venus, a day is longer than a year.";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent,"Share using"));
            }
        });

        SButton4 = (Button)findViewById(R.id.SButton4);
        SButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Ancient astronomers once believed the Earth was at the centre of the Universe but now we know that the Sun is at the centre of our Solar System and our planets orbit the Sun. The Sun makes up 99.8% of the entire mass of the whole Solar... More details in Spaze";
                String shareSub = "One million Earths could fit inside the Sun.";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent,"Share using"));
            }
        });

        SButton5 = (Button)findViewById(R.id.SButton5);
        SButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Light year is a measure of distance, not time. It is the distance that light travels during one Earth year ( The speed of light is 300,000km/s, which means that this is a very, tremendously, amazingly huge distance of over 9.5 trillion km), AU, or... More details in Spaze";
                String shareSub = "Light year and AU (Astronomical unit)";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent,"Share using"));
            }
        });


    }
}

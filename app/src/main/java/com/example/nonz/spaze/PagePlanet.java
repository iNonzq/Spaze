package com.example.nonz.spaze;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class PagePlanet extends AppCompatActivity {
    Dialog Sun_dia;
    ImageButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_planet);

        Sun_dia = new Dialog(this);
    }

    public PagePlanet(View v) {
        ImageButton closebtn, SunBtn;

        Sun_dia.setContentView(R.layout.sun_dialog);
        b1 = (ImageButton) findViewById(R.id.SunBtn);
        closebtn =(ImageButton) Sun_dia.findViewById(R.id.closebtn);

        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sun_dia.dismiss();
            }
        });
        Sun_dia.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Sun_dia.show();


        /* b1 = (ImageButton) findViewById(R.id.SunBtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(PagePlanet.this,sun_dialog.layout);
                startActivity(B1);
            }
        });
        */
    }
}

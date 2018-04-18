package com.example.nonz.spaze;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class PagePlanet extends AppCompatActivity {
    Dialog Sun_dia;
    ImageButton s1,c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_planet);

        s1 = (ImageButton) findViewById(R.id.SunBtn);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Sun_dia = new Dialog(PagePlanet.this);
                Sun_dia.setContentView(R.layout.sun_dialog);
                c1 = (ImageButton) Sun_dia.findViewById(R.id.closebtn);
                c1.setEnabled(true);
                c1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Sun_dia.dismiss();
                    }
                });
                Sun_dia.show();

            }
        });
    }
    /*public void ShowPopup() {
        ImageButton c1;
        Sun_dia = new Dialog(PagePlanet.this);
        Sun_dia.setContentView(R.layout.sun_dialog);

        c1 = (ImageButton) Sun_dia.findViewById(R.id.closebtn);
        c1.setEnabled(true);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sun_dia.dismiss();
            }
        });

        Sun_dia.show();
    }*/
}

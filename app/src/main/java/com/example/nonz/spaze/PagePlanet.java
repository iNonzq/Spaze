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
    ImageButton SunBtn,closeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_planet);

        SunBtn = (ImageButton) findViewById(R.id.SunBtn);
        SunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup();
            }
        });
    }
    public void ShowPopup() {
        Sun_dia = new Dialog(PagePlanet.this);
        Sun_dia.setContentView(R.layout.sun_dialog);

        closeBtn = (ImageButton) findViewById(R.id.closebtn);
        closeBtn.setEnabled(true);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sun_dia.cancel();
            }
        });
        Sun_dia.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Sun_dia.show();
    }
}

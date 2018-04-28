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
    Dialog Sun_dia,Mer_dia,Ven_dia,Eth_dia,Mar_dia,Sat_dia,Jup_dia,Ura_dia,Nep_dia,Plu_dia;
    ImageButton s1,c1,s2,c2,s3,s4,s5,s6,s7,s8,s9,s10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_planet);

        //Sun image button
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

        //Mercury Image Button
        s2 = (ImageButton) findViewById(R.id.MerBtn);

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Mer_dia = new Dialog(PagePlanet.this);
                Mer_dia.setContentView(R.layout.mercury_dialog);
                c2 = (ImageButton) Mer_dia.findViewById(R.id.closebtn2);
                c2.setEnabled(true);
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Mer_dia.dismiss();
                    }
                });
                Mer_dia.show();

            }
        });

        //Venus Image Button
        s3 = (ImageButton) findViewById(R.id.VenBtn);

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Ven_dia = new Dialog(PagePlanet.this);
                Ven_dia.setContentView(R.layout.venus_dialog);
                c2 = (ImageButton) Ven_dia.findViewById(R.id.closebtn2);
                c2.setEnabled(true);
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Ven_dia.dismiss();
                    }
                });
                Ven_dia.show();

            }
        });

        //Earth Image Button
        s4 = (ImageButton) findViewById(R.id.EthBtn);

        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Eth_dia = new Dialog(PagePlanet.this);
                Eth_dia.setContentView(R.layout.earth_dialog);
                c2 = (ImageButton) Eth_dia.findViewById(R.id.closebtn2);
                c2.setEnabled(true);
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Eth_dia.dismiss();
                    }
                });
                Eth_dia.show();

            }
        });

        //Mars Image Button
        s5 = (ImageButton) findViewById(R.id.MarBtn);

        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Mar_dia = new Dialog(PagePlanet.this);
                Mar_dia.setContentView(R.layout.mars_dialog);
                c2 = (ImageButton) Mar_dia.findViewById(R.id.closebtn2);
                c2.setEnabled(true);
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Mar_dia.dismiss();
                    }
                });
                Mar_dia.show();

            }
        });

        //Saturn Image Button
        s6 = (ImageButton) findViewById(R.id.SatBtn);

        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Sat_dia = new Dialog(PagePlanet.this);
                Sat_dia.setContentView(R.layout.saturn_dialog);
                c2 = (ImageButton) Sat_dia.findViewById(R.id.closebtn2);
                c2.setEnabled(true);
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Sat_dia.dismiss();
                    }
                });
                Sat_dia.show();

            }
        });

        //Jupiter Image Button
        s7 = (ImageButton) findViewById(R.id.JupBtn);

        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Jup_dia = new Dialog(PagePlanet.this);
                Jup_dia.setContentView(R.layout.jupiter_dialog);
                c2 = (ImageButton) Jup_dia.findViewById(R.id.closebtn2);
                c2.setEnabled(true);
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Jup_dia.dismiss();
                    }
                });
                Jup_dia.show();

            }
        });

        //Uranus Image Button
        s8 = (ImageButton) findViewById(R.id.UraBtn);

        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Ura_dia = new Dialog(PagePlanet.this);
                Ura_dia.setContentView(R.layout.uranus_dialog);
                c2 = (ImageButton) Ura_dia.findViewById(R.id.closebtn2);
                c2.setEnabled(true);
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Ura_dia.dismiss();
                    }
                });
                Ura_dia.show();

            }
        });

        //Neptune Image Button
        s9 = (ImageButton) findViewById(R.id.NepBtn);

        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Nep_dia = new Dialog(PagePlanet.this);
                Nep_dia.setContentView(R.layout.neptune_dialog);
                c2 = (ImageButton) Nep_dia.findViewById(R.id.closebtn2);
                c2.setEnabled(true);
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Nep_dia.dismiss();
                    }
                });
                Nep_dia.show();
            }
        });

        //Neptune Image Button
        s10 = (ImageButton) findViewById(R.id.PluBtn);

        s10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ShowPopup();
                Plu_dia = new Dialog(PagePlanet.this);
                Plu_dia.setContentView(R.layout.pluto_dialog);
                c2 = (ImageButton) Plu_dia.findViewById(R.id.closebtn2);
                c2.setEnabled(true);
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Plu_dia.dismiss();
                    }
                });
                Plu_dia.show();
            }
        });

    }
}

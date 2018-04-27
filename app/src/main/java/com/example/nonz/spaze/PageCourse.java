package com.example.nonz.spaze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class PageCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_course);

        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner1);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(PageCourse.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names1));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);

        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(PageCourse.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names2));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);

        Spinner mySpinner3 = (Spinner) findViewById(R.id.spinner3);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(PageCourse.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names3));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner3.setAdapter(myAdapter3);

        Spinner mySpinner4 = (Spinner) findViewById(R.id.spinner4);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> myAdapter4 = new ArrayAdapter<String>(PageCourse.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names4));
        myAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner4.setAdapter(myAdapter4);

        mySpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent1, View view1, int position1, long id) {

                String s1=((TextView)view1).getText().toString();
                switch(s1) {
                    case ("Level 1") : // for item 1
                        Intent i = new Intent(PageCourse.this,PageSchedule.class);
                        startActivity(i);
                        break;
                    case ("Level 2") :
                        /*startActivity(new Intent(view.getContext(),PageLogin.class));*/
                        break;
                    /* you can have any number of case statements */
                    default :
                }
            }
            public void onNothingSelected(AdapterView<?> parent1)  {
                // TODO Auto-generated method stub
            }
        });

        mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent2, View view2, int position2, long id) {

                String s2=((TextView)view2).getText().toString();
                switch(s2) {
                    case ("Level 4") : // for item 1
                        Intent i = new Intent(PageCourse.this,PageSchedule.class);
                        startActivity(i);
                        break;
                    case ("Level 5") :
                        /*startActivity(new Intent(view.getContext(),PageLogin.class));*/
                        break;
                    /* you can have any number of case statements */
                    default :
                }
            }
            public void onNothingSelected(AdapterView<?> parent2)  {
                // TODO Auto-generated method stub
            }
        });
        /*mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                String s=((TextView)view).getText().toString();
                if(s.equals("Level 4"))
                   startActivity(new Intent(view.getContext(),PageLogin.class));
                if(s.equals("Level 5"))
                    startActivity(new Intent(view.getContext(),PageCourse.class));

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }


        });*/
    }
}

package com.example.nonz.spaze;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.provider.CalendarContract.Events;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PageSchedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_schedule);}

        public long getLongAsDate(int year, int month, int date) {
            Calendar calendar = new GregorianCalendar();
            calendar.set(Calendar.DAY_OF_MONTH, date);
            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.YEAR, year);
            return calendar.getTimeInMillis();

        }

        public void onAddEventClicked(View view){
            Intent intent = new Intent(Intent.ACTION_INSERT);
            intent.setType("vnd.android.cursor.item/event");

            Calendar cal = Calendar.getInstance();
            long startTime = cal.getTimeInMillis();
            long endTime = cal.getTimeInMillis()  + 60 * 60 * 1000;

            /*String startDate = "2018-04-29";
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
                startTime=date.getTime();
            }
            catch(Exception e){ }

            Calendar CalendarView = Calendar.getInstance();
            Intent intent = new Intent(Intent.ACTION_EDIT);
            intent.setType("vnd.android.cursor.item/event");
            intent.putExtra("beginTime",startTime);
            intent.putExtra("allDay", true);
            intent.putExtra("rrule", "FREQ=YEARLY");
            intent.putExtra("endTime", endTime);
            intent.putExtra("title", "A Test Event from android app");
            startActivity(intent);*/

            intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, startTime);
            intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,endTime);
            intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);

            intent.putExtra(CalendarContract.Events.TITLE, "Neel Birthday");
            intent.putExtra(CalendarContract.Events.DESCRIPTION,  "This is a sample description");
            intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "My Guest House");
            intent.putExtra(CalendarContract.Events.RRULE, "FREQ=YEARLY");

        startActivity(intent);
    }

    }


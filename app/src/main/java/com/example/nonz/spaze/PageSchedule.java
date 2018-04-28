package com.example.nonz.spaze;

import android.app.usage.UsageEvents;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.provider.CalendarContract.Events;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ShareActionProvider;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class PageSchedule extends AppCompatActivity {
    Button a1;
    CompactCalendarView compactCalendar;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM-yyyy", Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_schedule);

        a1 = (Button) findViewById(R.id.button6);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(PageSchedule.this,CalendarDetail.class);
                startActivity(A1);
            }
        });

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle(null);

        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);

        final Event ev1 = new Event(Color.WHITE, 1477040400000L, "Teachers' Professional Day");
        compactCalendar.addEvent(ev1);
        final Event ev2 = new Event(Color.WHITE, 1525100573000L, "Full Moon");
        compactCalendar.addEvent(ev2);
        Event ev3 = new Event(Color.WHITE, 1525618973000L, "Eta Aquarids");
        compactCalendar.addEvent(ev3);
        Event ev4 = new Event(Color.WHITE, 1525683600000L, "Eta Aquarids");
        compactCalendar.addEvent(ev4);
        Event ev5 = new Event(Color.WHITE, 1525899600000L, "Jupiter at Opposition");
        compactCalendar.addEvent(ev5);
        Event ev6 = new Event(Color.WHITE, 1526418000000L, "New Moon");
        compactCalendar.addEvent(ev6);
        Event ev7 = new Event(Color.WHITE, 1527627600000L, "Full Moon");
        compactCalendar.addEvent(ev7);

        //Event ev1 = new Event(Color.WHITE,1524906000000L, "Test");
        //compactCalendar.addEvent(ev1);

        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();
                if(dateClicked.equals(ev2)){
                    //if (dateClicked.toString().compareTo("Fri Oct 21 00:00:00 AST 2016") == 0) {
                    //if(dateClicked.toString().compareTo("Saturday, April 28, 2018 9:00:00 AM")==0){
                        Toast.makeText(context, "Test", Toast.LENGTH_SHORT).show();
                    }
            }
            //test

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                actionBar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        mShareActionProvider = (ShareActionProvider) menu.findItem(R.id.shareButton).getActionProvider();
        mShareActionProvider.setShareIntent(doShare());
        return true;
    }
    public Intent doShare() {
        // populate the share intent with data
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Put whatever you want");
        return intent;
    }*/

        /*public long getLongAsDate(int year, int month, int date) {
            Calendar calendar = new GregorianCalendar();
            calendar.set(Calendar.DAY_OF_MONTH, date);
            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.YEAR, year);
            return calendar.getTimeInMillis();

        }*/
        private ShareActionProvider mShareActionProvider;

    /*@Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        // Inflate menu resource file.
        getMenuInflater().inflate(R.menu.menu, menu);

        // Locate MenuItem with ShareActionProvider
        MenuItem item = menu.findItem(R.id.shareButton);

        // Fetch and store ShareActionProvider
        mShareActionProvider = (ShareActionProvider) item.getActionProvider();
        // Return true to display menu
        return true;
    }

    // Call to update the share intent
    private void setShareIntent(Intent shareIntent) {
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(shareIntent);
        }
    }*/


    }


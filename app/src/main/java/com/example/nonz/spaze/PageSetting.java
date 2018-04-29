package com.example.nonz.spaze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageSetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_setting);


    }
}
/*public class ProfileActivity extends AppCompatActivity {

    LoginDataBaseAdapter loginDataBaseAdapter;
//TextView profileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        try {
            loginDataBaseAdapter=loginDataBaseAdapter.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        TextView profileName = (TextView) findViewById(R.id.profileNameTextView);
        String userName = loginDataBaseAdapter.getUserName("USERNAME");
        String user = loginDataBaseAdapter.getUserName(userName);



        profileName.setText("hello" + user);
    }*/


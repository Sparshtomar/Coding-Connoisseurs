package com.example.codingconnoisseurs;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }

    public void openActivitycodeofconduct(View V){
        Intent intent = new Intent(this, CodeOfConduct.class);
        startActivity(intent);
    }

    public void openActivitypastevents(View V){
        Intent intent = new Intent(this, pastevents.class);
        startActivity(intent);
    }

    public void openActivityUpcomingEvents(View V) {
        Intent intent = new Intent(this, UpcomingEvents.class);
        startActivity(intent);
    }
}
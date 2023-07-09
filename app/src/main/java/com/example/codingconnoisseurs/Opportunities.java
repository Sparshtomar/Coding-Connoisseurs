package com.example.codingconnoisseurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Opportunities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opportunities);
    }
    public void openActivityOpenSource(View V){
        Intent intent = new Intent(this, OpenSource.class);
        startActivity(intent);
    }
    public void openActivityComptetive(View V){
        Intent intent = new Intent(this, ComptetiveProgramming.class);
        startActivity(intent);
    }
    public void openActivityDeveloper(View V){
        Intent intent = new Intent(this, DevelopersClubs.class);
        startActivity(intent);
    }
    public void openActivityInternships(View V){
        Intent intent = new Intent(this, InternshipsAndJobs.class);
        startActivity(intent);
    }
}
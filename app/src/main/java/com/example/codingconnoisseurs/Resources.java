package com.example.codingconnoisseurs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Resources extends AppCompatActivity {

    CardView cardview5;
    CardView cardview6;
    CardView cardview7;
    CardView cardview8;
    CardView cardview9;
    CardView cardview10;
    CardView cardview11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        cardview5 = findViewById(R.id.cardview5);
        cardview6 = findViewById(R.id.cardview6);
        cardview7 = findViewById(R.id.cardview7);
        cardview8 = findViewById(R.id.cardview8);
        cardview9 = findViewById(R.id.cardview9);
        cardview10 = findViewById(R.id.cardview10);
        cardview11 = findViewById(R.id.cardview11);

        cardview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://designresourc.es/");
            }
        });


        cardview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://github.com/bradtraversy/design-resources-for-developers#table-of-contents");
            }
        });


        cardview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.linkedin.com/pulse/sign-up-apmrpm-resources-college-seniors-final-year-sithamparathas");
            }
        });



        cardview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.amazon.in/Cracking-PM-Interview-Product-Technology/dp/0984782818");
            }
        });

        cardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://roadmap.sh/devops");
            }
        });

        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://roadmap.sh/backend");
            }
        });

        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://roadmap.sh/frontend");
            }
        });
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void openActivityOS(View v){
        Intent intent = new Intent(this, OS.class);
        startActivity(intent);
    }

    public void openActivityDSA(View v) {
        Intent intent = new Intent(this, DSA.class);
        startActivity(intent);
    }

    public void openActivityCP(View v) {
        Intent intent = new Intent(this, CP.class);
        startActivity(intent);
    }

}
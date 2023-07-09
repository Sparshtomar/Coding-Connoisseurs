package com.example.codingconnoisseurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CP extends AppCompatActivity {

    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cp);

        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://towardsdatascience.com/the-one-year-plan-for-competitive-coding-6af53f2f719c?gi=72f46104ea37");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://docs.google.com/spreadsheets/d/1KfZq_onP06UDqizkLOjraOfw2qIODDqMyd-3knUu3hA/edit#gid=196839908");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://docs.google.com/spreadsheets/d/1O_qwBKEESxXos-4auFjiU56RemuF2Fic--Mm7ABPvHA/edit#gid=0");
            }
        });
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
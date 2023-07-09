package com.example.codingconnoisseurs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView30;
    TextView textView29;
    TextView textView31;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView2 = findViewById(R.id.imageView9);
        imageView3 = findViewById(R.id.imageView13);
        imageView4 = findViewById(R.id.imageView10);
        imageView5 = findViewById(R.id.imageView11);
        imageView6 = findViewById(R.id.imageView12);
        imageView1 = findViewById(R.id.imageView7);
        textView30 = findViewById(R.id.textView30);
        textView29 = findViewById(R.id.textView29);
        textView31 = findViewById(R.id.textView31);

        textView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.google.co.in/maps/place/Second+Campus,+University+of+Lucknow/@26.9302088,80.9319747,15z/data=!4m10!1m2!2m1!1sWWGQ%2B78P,+Jankipuram+Vistar,+Sultanpur+Village,+Jankipuram+Extension,+Lucknow,+Uttar+Pradesh+226021!3m6!1s0x39995655b5755fe3:0x1b94db368f92923b!8m2!3d26.925714!4d80.9383245!15sCmNXV0dRKzc4UCwgSmFua2lwdXJhbSBWaXN0YXIsIFN1bHRhbnB1ciBWaWxsYWdlLCBKYW5raXB1cmFtIEV4dGVuc2lvbiwgTHVja25vdywgVXR0YXIgUHJhZGVzaCAyMjYwMjFaYCJed3dncSA3OHAgamFua2lwdXJhbSB2aXN0YXIgc3VsdGFucHVyIHZpbGxhZ2UgamFua2lwdXJhbSBleHRlbnNpb24gbHVja25vdyB1dHRhciBwcmFkZXNoIDIyNjAyMZIBCnVuaXZlcnNpdHmaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVTTJhVXd0T0VsUkVBReABAA!16s%2Fg%2F1td4n2xg?hl=en");
            }
        });

        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://mail.google.com/mail/?view=cm&fs=1&to=cc.foet@gmail.com&su=SUBJECT&body=BODY&bcc=cc.foet@gmail.com");
            }
        });

        textView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://cc-foet.netlify.app");
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.linkedin.com/company/coding-connoiseurs/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.instagram.com/cod.ngclub/");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://github.com/Coding-Connoisseurs/");
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.youtube.com/channel/UCfaEKlZXHP1SRc-rSDSi1tg");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://discord.com/invite/QGZc57Y9yq");
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://discord.com/invite/QGZc57Y9yq");
            }
        });

    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void openActivityOpportunities(View v){
        Intent intent = new Intent(this, Opportunities.class);
        startActivity(intent);
    }
    public void openActivityResources(View v){
        Intent intent = new Intent(this, Resources.class);
        startActivity(intent);
    }
    public void openActivityTeam(View v){
        Intent intent = new Intent(this, Team.class);
        startActivity(intent);
    }
    public void openActivityEvents(View v){
        Intent intent = new Intent(this, Events.class);
        startActivity(intent);
    }
}

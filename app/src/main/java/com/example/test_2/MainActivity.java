package com.example.test_2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView prothomcardView, stercardView, kalcardView,timecardView,samakalcardView,nayacardView,
            jugantorcardView, suncardView,mancardView,morningcardView,aboutcardView;

    ActionBar actionBar;
    String[]urls=new String[11];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable((Color.parseColor("#0C0C0C"))));


        prothomcardView=findViewById(R.id.prothom);
        stercardView=findViewById(R.id.ster);
        kalcardView=findViewById(R.id.kal);
        timecardView=findViewById(R.id.time);
        samakalcardView=findViewById(R.id.samakal);
        nayacardView=findViewById(R.id.naya);
        jugantorcardView=findViewById(R.id.jug);
        suncardView=findViewById(R.id.sun);
        mancardView=findViewById(R.id.man);
        morningcardView=findViewById(R.id.morning);
        aboutcardView=findViewById(R.id.about);

        urls[0]="https://www.prothomalo.com/";
        urls[1]="https://www.thedailystar.net/";
        urls[2]="https://www.kalerkantho.com/";
        urls[3]="https://www.amadershomoy.com/bn/";
        urls[4]="https://www.breakingnews.com.bd/";
        urls[5]="https://www.dailynayadiganta.com/";
        urls[6]="https://www.jugantor.com/";
        urls[7]="https://www.daily-sun.com/";
        urls[8]="https://www.sangbadkonika.com/";
        urls[9]="https://www.bhorerkagoj.com/";


        prothomcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });

        stercardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[1]);
                startActivity(intent);
            }
        });

        kalcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[2]);
                startActivity(intent);
            }
        });timecardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[3]);
                startActivity(intent);
            }
        });
        samakalcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[4]);
                startActivity(intent);
            }
        });nayacardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[5]);
                startActivity(intent);
            }
        });jugantorcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[6]);
                startActivity(intent);
            }
        });suncardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[7]);
                startActivity(intent);
            }
        });mancardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[8]);
                startActivity(intent);
            }
        });morningcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links",urls[9]);
                startActivity(intent);
            }
        });

        aboutcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,aboutActivity.class);
                startActivity(intent);

            }
        });

    }
}

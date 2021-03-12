package com.example.test_2;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class aboutActivity extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable((Color.parseColor("#0C0C0C"))));
    }
}

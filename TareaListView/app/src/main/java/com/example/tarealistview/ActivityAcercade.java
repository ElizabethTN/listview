package com.example.tarealistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ActivityAcercade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        getSupportActionBar().hide();
    }
}

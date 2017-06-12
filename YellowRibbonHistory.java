package com.example.larsnik2.yellowribbonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class YellowRibbonHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_ribbon_history);
    }

    public void sendHome(View view) {
        // sends the user to the share story screen
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

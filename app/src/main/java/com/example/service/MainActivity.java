package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnStart;
    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart=findViewById(R.id.btnstart);
        btnStop=findViewById(R.id.btnstop);


    }

    public void serviceHandler(View view) {
        Intent serviceIntent = new Intent(this,CateringService.class);
        switch (view.getId()){
            case R.id.btnstart:
                serviceIntent.putExtra("mkey","musicfilename.mp3");
                startService(serviceIntent);
                break;
            case R.id.btnstop:
                stopService(serviceIntent);
                break;
        }
    }
}
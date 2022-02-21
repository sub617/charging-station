package com.example.internship2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.internship2.databinding.ActivitySpashactivityBinding;

public class spashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spashactivity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(spashactivity.this,MapsActivity.class);
                        startActivity(i);
                        finish();

            }
        },2000);
    }
}
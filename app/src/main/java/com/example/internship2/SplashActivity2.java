package com.example.internship2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SplashActivity2 extends AppCompatActivity {

    private TextView register;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate((savedInstanceState));
        setContentView(R.layout.activity_spashactivity);

        register = (TextView) findViewById(R.id.register);
        register.setOnClickListener(view -> startActivity(new Intent(SplashActivity2.this,Registeruser.class)));
    }
}
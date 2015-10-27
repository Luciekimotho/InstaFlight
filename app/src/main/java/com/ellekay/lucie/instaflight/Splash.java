package com.ellekay.lucie.instaflight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Handler;

public class Splash extends AppCompatActivity {

    //timer for splash screen
    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent i = new Intent(Splash.this, SignUp.class);
               startActivity(i);

               finish();
           }
       },SPLASH_TIME_OUT);
    }
}

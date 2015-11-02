package com.ellekay.lucie.instaflight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Agenda extends AppCompatActivity implements View.OnClickListener {
    CardView day1, day2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        day1 = (CardView) findViewById(R.id.day1card);
        day2 = (CardView) findViewById(R.id.day2card);

        day1.setOnClickListener(this);
        day2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.day1card ){
            Intent i = new Intent(this, DayOne.class);
            startActivity(i);
        }else if (id == R.id.day2card){
            Intent i = new Intent(this, DayTwo.class);
            startActivity(i);
        }

    }
}

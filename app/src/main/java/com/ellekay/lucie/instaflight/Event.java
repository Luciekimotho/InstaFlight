package com.ellekay.lucie.instaflight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Event extends AppCompatActivity {
    GridView gridView;
    static final String[] Titles = new String[]{
            "SPEAKERS", "AGENDA", "TWITTER FEED", "INFORMATION"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new EventAdapter(this,Titles));


    }

}

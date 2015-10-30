package com.ellekay.lucie.instaflight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Event extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gridView;
    static final String[] Titles = new String[]{
            "SPEAKERS", "AGENDA", "TWITTER", "INFORMATION"
    };
    static final int[] imageId = {
            R.drawable.agenda,
            R.drawable.speakers,
            R.drawable.info,
            R.drawable.twitter
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new EventAdapter(this, Titles, imageId));

        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d("other id",""+Titles[position]);
        if (Titles[position] == "TWITTER") {
            Intent in = new Intent(this, Twitter.class);
            startActivity(in);
        }else if (Titles[position] == "AGENDA"){
            Intent in2 = new Intent(this, Agenda.class);
            startActivity(in2);
        }else if (Titles[position] == "SPEAKERS"){
            Intent in3 = new Intent(this, Speakers.class);
            startActivity(in3);
        }else if (Titles[position] == "INFORMATION"){
            Intent in4 = new Intent(this,Information.class);
            startActivity(in4);
        }
    }
}

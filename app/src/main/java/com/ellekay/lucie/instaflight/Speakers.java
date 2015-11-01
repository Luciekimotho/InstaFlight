package com.ellekay.lucie.instaflight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Speakers extends AppCompatActivity {
    private List<MySpeaker> speakers;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speaker);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        })*/
        ;

        rv = (RecyclerView) findViewById(R.id.speaker_recycler);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData() {
        speakers = new ArrayList<>();
        speakers.add(new MySpeaker("Marissa Meyer", "CEO Yahoo", "@marissameyer", R.drawable.speakers));
        speakers.add(new MySpeaker("Peter Thiel", "Venture Capitalist", "@lpthiel", R.drawable.speakers));
        speakers.add(new MySpeaker("Adam Sandler", "Software developer", "@adsm", R.drawable.speakers));
        speakers.add(new MySpeaker("Susan Kare", "User Interface Guru", "@suekare", R.drawable.speakers));
        speakers.add(new MySpeaker("Chris Kirubi", "Investor", "@ckirubi", R.drawable.speakers));
    }

    private void initializeAdapter() {
        SpeakerAdapter adapter = new SpeakerAdapter(speakers);
        rv.setAdapter(adapter);
    }

    }

package com.ellekay.lucie.instaflight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Information extends AppCompatActivity {

    private ListView infolistview;
    private ArrayAdapter<String> infoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        infolistview = (ListView) findViewById(R.id.infolist);

        String[] info = new String[]{"WIFI", "VENUE","PAYMENT","TRANSPORT","CONTACT"};
        ArrayList<String> infolist = new ArrayList<String>();
        infolist.addAll(Arrays.asList(info));

        infoAdapter = new ArrayAdapter<String>(this,R.layout.information_item, infolist);

        infolistview.setAdapter(infoAdapter);
    }
}

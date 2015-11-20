package com.ellekay.lucie.instaflight;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity implements View.OnClickListener {
    Button twitter, facebook, gplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_sign_up);

        twitter = (Button) findViewById(R.id.button);
        gplus = (Button) findViewById(R.id.button2);
        facebook = (Button) findViewById(R.id.button3);


        twitter.setOnClickListener(this);
        gplus.setOnClickListener(this);
        facebook.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id =v.getId();
        if (id == R.id.button){
            Intent i = new Intent(SignUp.this, Event.class);
            startActivity(i);
        }else if (id == R.id.button2){
            Intent i2 = new Intent(SignUp.this,Event.class );
            startActivity(i2);
        }else if (id == R.id.button3){
            Intent i3 = new Intent(SignUp.this, Event.class);
            startActivity(i3);
        }

    }
}

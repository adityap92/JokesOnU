package com.jokesactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    String joke;
    TextView tvJoke;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mContext = getApplicationContext();
        Intent intent = getIntent();
        if(intent!=null){
            joke = intent.getStringExtra("joke");
        }else
            joke = "No Intent Passed";

        tvJoke = (TextView) findViewById(R.id.tvJoke);
        tvJoke.setText(joke);

    }
}

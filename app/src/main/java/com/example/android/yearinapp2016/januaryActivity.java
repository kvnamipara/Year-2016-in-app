package com.example.android.yearinapp2016;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class januaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_january);
    }

    public void int_jan(View view){
        Intent i = new Intent(januaryActivity.this, inter_janActivity.class);
        startActivity(i);
    }
    public void ind_jan(View view){
        Intent i = new Intent(januaryActivity.this, india_janActivity.class);
        startActivity(i);
    }
    public void sport_jan(View view){
        Intent i = new Intent(januaryActivity.this, sports_janActivity.class);
        startActivity(i);
    }
    public void sci_jan(View view){
        Intent i = new Intent(januaryActivity.this, science_janActivity.class);
        startActivity(i);
    }

    public void awd_jan(View view){
        Intent i = new Intent(januaryActivity.this, awd_janActivity.class);
        startActivity(i);
    }
    public void ind_wld_jan(View view){
        Intent i = new Intent(januaryActivity.this, ind_wld_janActivity.class);
        startActivity(i);
    }
}

package com.example.android.yearinapp2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class februaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_february);
    }
    public void int_feb(View view){
        Intent i = new Intent(februaryActivity.this, inter_febActivity.class);
        startActivity(i);
    }
    public void ind_feb(View view){
        Intent i = new Intent(februaryActivity.this, india_febActivity.class);
        startActivity(i);
    }
    public void sport_feb(View view){
        Intent i = new Intent(februaryActivity.this, sports_febActivity.class);
        startActivity(i);
    }
    public void sci_feb(View view){
        Intent i = new Intent(februaryActivity.this, science_febActivity.class);
        startActivity(i);
    }

    public void awd_feb(View view){
        Intent i = new Intent(februaryActivity.this, awd_febActivity.class);
        startActivity(i);
    }
    public void ind_wld_feb(View view){
        Intent i = new Intent(februaryActivity.this, ind_wld_febActivity.class);
        startActivity(i);
    }
}

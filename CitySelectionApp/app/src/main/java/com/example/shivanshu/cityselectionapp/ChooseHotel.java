package com.example.shivanshu.cityselectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ChooseHotel extends AppCompatActivity {
    TextView countryTextView;
    TextView cityTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_hotel);
        countryTextView=(TextView)findViewById(R.id.country_text_view);
        cityTextView=(TextView)findViewById(R.id.city_text_view);
        Intent intent=getIntent();
        String dig=intent.getStringExtra("country name");
       Log.d("digvijay",dig);
        //countryTextView.setText("hello world");
       countryTextView.setText(intent.getStringExtra("country name"));
        cityTextView.setText(intent.getStringExtra("city name"));

    }
}

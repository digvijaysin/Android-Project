package com.example.shivanshu.cityselectionapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class CountryActivity extends AppCompatActivity implements View.OnClickListener {

public static  int COUNTRY_RESULT=10;
    private static String Country_response;
public static  int CITY_REQUEST=0;

Button Done_button;
    public Intent CreateIntent(Context c, String s)
    {
        Intent intent=new Intent(c,CountryActivity.class);
        Country_response=s;
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        Done_button=(Button)findViewById(R.id.done_button);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.my_country_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CountryAdapter());
        Done_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();

        intent.putExtra(Country_response,new CountrySelection().SelectedCountry);
       setResult(RESULT_OK,intent);
        finish();


    }
}

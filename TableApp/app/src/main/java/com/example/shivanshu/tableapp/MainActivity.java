package com.example.shivanshu.tableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tablebutton;
    Button squarebutton;
    Button cubebutton;
    Button settingbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablebutton=(Button) findViewById(R.id.table_button);
        squarebutton=(Button) findViewById(R.id.square_button);
        cubebutton=(Button) findViewById(R.id.cube_button);
        settingbutton=(Button) findViewById(R.id.setting_button);
        tablebutton.setOnClickListener(this);
        squarebutton.setOnClickListener(this);
        cubebutton.setOnClickListener(this);
        tablebutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==tablebutton)
        {
            Intent intent=new Intent(this,TableA.class);
           new ViewStrig().DataName=tablebutton.getText().toString();
            Log.d("digvijay",new ViewStrig().DataName);
            startActivity(intent);
        }

    }
}

package com.example.shivanshu.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        textView = (TextView) findViewById(R.id.text);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        textView.setText(username);
    }
}

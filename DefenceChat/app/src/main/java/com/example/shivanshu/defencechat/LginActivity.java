package com.example.shivanshu.defencechat;

import android.content.Intent;
import android.icu.text.AlphabeticIndex;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LginActivity extends AppCompatActivity {
ActionBar action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lgin);
    }
    public void setpassword(View vew)
    {
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

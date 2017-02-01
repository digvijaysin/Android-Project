package com.example.shivanshu.defencechat;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.shivanshu.defencechat.R.layout.action_layout;

public class MainActivity extends AppCompatActivity {
ActionBar action;
    Application application;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callFunction(View view)
    {
        if(view.getId()==R.id.call)
        {
            setContentView(R.layout.activity_call);

        }
        else if(view.getId()==R.id.Chat)
        {
            setContentView(R.layout.activity_chat_actvity);
        }
        else if(view.getId()==R.id.Mission)
        {setContentView(R.layout.activity_mission);
        }
    }
}

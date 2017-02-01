package com.example.shivanshu.defencechat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
    }
    public void callFunction(View view)
    {
       // if(view.getId()==R.id.call)
        //{
          //  Intent intent=new Intent(this,CallActivity.class);
            //startActivity(intent);
        //}
         if(view.getId()==R.id.Chat)
        {
            Intent intent=new Intent(this,ChatActvity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.Mission)
        {
            Intent intent=new Intent(this,MissionActivity.class);
            startActivity(intent);
        }
    }
}

package com.example.shivanshu.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void settingFuction(View view)
    {
        EditText e1=(EditText) findViewById(R.id.username);
        String enteredValue=e1.getText().toString();
        Log.d("codekamp",enteredValue);
        Intent intent=new Intent(this,SettingActivity.class);
        intent.putExtra("username",enteredValue);
        startActivity(intent);
    }
}

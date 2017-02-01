package com.example.shivanshu.tableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {
TextView table;
    static String tableno;
    public static String process;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        Intent intent=getIntent();
        tableno = intent.getStringExtra("table No");
        process=intent.getStringExtra("computation");
        Log.d("digvijay", tableno);
        table=(TextView)findViewById(R.id.table_heading);
        table.append(tableno);
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.table_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TablePrintAdapter());



    }
}

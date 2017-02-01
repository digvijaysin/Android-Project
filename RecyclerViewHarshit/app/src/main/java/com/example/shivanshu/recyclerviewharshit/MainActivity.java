package com.example.shivanshu.recyclerviewharshit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView MyRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyRecyclerView=(RecyclerView)findViewById(R.id.my_recycler_view);
        MyRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyRecyclerView.setAdapter(new FriendListAdapater());
    }
}

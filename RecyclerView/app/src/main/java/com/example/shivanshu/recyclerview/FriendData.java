package com.example.shivanshu.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shivanshu on 1/19/2017.
 */

public class FriendData extends RecyclerView.ViewHolder {
TextView nametext;
    TextView Hometowntext;
    public FriendData(View itemView) {
        super(itemView);
       nametext=(TextView)itemView.findViewById(R.id.name_text_view);
       Hometowntext=(TextView)itemView.findViewById(R.id.home_town_view);


    }
}

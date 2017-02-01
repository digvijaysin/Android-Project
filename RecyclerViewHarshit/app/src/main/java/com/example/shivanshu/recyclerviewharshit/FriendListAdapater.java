package com.example.shivanshu.recyclerviewharshit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by shivanshu on 1/21/2017.
 */

public class FriendListAdapater extends RecyclerView.Adapter<FriendViewHolder> {
    List<FriendViewHolder> friendList;

    @Override
    public FriendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.friends_row,parent,false);

        return new FriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FriendViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 20;
    }
}

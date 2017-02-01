package com.example.shivanshu.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivanshu on 1/19/2017.
 */

public class Adapter extends RecyclerView.Adapter<FriendData> {

    List<Friend> friendList;
    Adapter()
    {
        friendList=new ArrayList<>();
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("Priya pandey","delhi"));
        friendList.add(new Friend("digvijay","jhansi"));
        friendList.add(new Friend("digvijay","gaziabaad"));
        friendList.add(new Friend("digvijay","lucknow"));
        friendList.add(new Friend("digvijay","gorakhpur"));
        friendList.add(new Friend("digvijay","allahbaad"));
        friendList.add(new Friend("digvijay","mumbai"));
        friendList.add(new Friend("digvijay","banglore"));
        friendList.add(new Friend("digvijay","meerut"));
        friendList.add(new Friend("digvijay",""));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));
        friendList.add(new Friend("digvijay","Agra"));

    }

    @Override
    public FriendData onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Context context=parent.getContext();
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.friend_row,parent,false);
        return new FriendData(view);
    }
//method to set data in row.called infinite times depending upon data
    @Override
    public void onBindViewHolder(FriendData holder, int position)
    {
        Friend f= friendList.get(position);
        Log.d("digvijay", f.name);
       holder.nametext.setText(f.name);
        holder.Hometowntext.setText(f.homeTown);
    }

    @Override
    public int getItemCount() {
        return 5000;
    }
}

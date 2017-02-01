package com.example.shivanshu.cityselectionapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.data;

/**
 * Created by shivanshu on 1/26/2017.
 */

public class CountryAdapter extends RecyclerView.Adapter<CountryHolder> {
    List<CountryData> list;
    CountryAdapter()
    {
        list=new ArrayList<>();
        list.add(new CountryData("India"));
        list.add(new CountryData("Pakistan"));
        list.add(new CountryData("Nepal"));
        list.add(new CountryData("china"));
        list.add(new CountryData("Butan"));
        list.add(new CountryData("singapore"));
        list.add(new CountryData("newyork"));
        list.add(new CountryData("iraq"));
        list.add(new CountryData("iran"));
        list.add(new CountryData("Bangladesh"));
        list.add(new CountryData("manmyar"));
        list.add(new CountryData("srilanka"));
        list.add(new CountryData("australia"));
        list.add(new CountryData("england"));
        list.add(new CountryData("africa"));
        list.add(new CountryData("USA"));
        list.add(new CountryData("EUrope"));
        list.add(new CountryData("afganistan"));
        list.add(new CountryData("britain"));
        list.add(new CountryData("south Africa"));
        list.add(new CountryData("brazil"));
        list.add(new CountryData("israil"));
        list.add(new CountryData("Japan"));
    }

    @Override
    public CountryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater infalte=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=infalte.inflate(R.layout.coountry_list_layout,parent,false);
        return new CountryHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryHolder holder, int position) {

        CountryData data=list.get(position);
        Log.d("digvijay", data.CountryName);
        holder.countryName.setText(data.CountryName);
       // data=list.get(position+1);
        //holder.countryName2.setText(data.CountryName);
       // holder.selectedcountry(holder.countryName,data.CountryName);
    }

    @Override
    public int getItemCount()
    {
        return 20;
    }
}

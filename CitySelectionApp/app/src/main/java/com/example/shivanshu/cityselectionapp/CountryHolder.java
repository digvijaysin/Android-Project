package com.example.shivanshu.cityselectionapp;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shivanshu on 1/26/2017.
 */

public class CountryHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView countryName;
    private static final int ZERO_SELECTION=0;
    private static final int ONE_SELECTION=1;
    //private static final int CHANGE_SELECTION=2;

    static int flag=0;
    TextView countryName2;
static String countryname;
  static   TextView currentView;

  //Class Constructor

    public CountryHolder(View itemView) {
        super(itemView);
        countryName=(TextView)itemView.findViewById(R.id.country_name);
       // Log.d("digvijay","holder called");
//countryName2=(TextView)itemView.findViewById(R.id.country_name2);
        itemView.setOnClickListener(this);

    }
    //Country set method


    //country selection code;

    public void selectedcountry(View view ,String s) {
        countryname = s;
        new CountrySelection().setSelectedCountry(countryname);
        if (flag == ZERO_SELECTION) {
            currentView = (TextView) view;

            currentView.setBackgroundResource(R.color.background_color);
            flag=1;
        }
        else if(flag==ONE_SELECTION) {
            currentView.setBackgroundResource(R.color.colorPrimary);
            flag=2;
            currentView = (TextView) view;
            currentView.setBackgroundResource(R.color.background_color);


        }
        else {
            currentView.setBackgroundResource(R.color.colorPrimary);
            flag=1;
            currentView = (TextView) view;
            currentView.setBackgroundResource(R.color.background_color);

        }
    }

    @Override
    public void onClick(View v) {
        selectedcountry(this.countryName, (String) this.countryName.getText());



    }
}

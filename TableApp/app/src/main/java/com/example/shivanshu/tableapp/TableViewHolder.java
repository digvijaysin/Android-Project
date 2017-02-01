package com.example.shivanshu.tableapp;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.onClick;
import static android.R.attr.start;

/**
 * Created by shivanshu on 1/21/2017.
 */

public class TableViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView tablename;
  static  View currentview;
     public String tab;
    public static String data=new ViewStrig().DataName;
    public TableViewHolder(View itemView) {
        super(itemView);
        tablename=(TextView)itemView.findViewById(R.id.table);
        itemView.setOnClickListener(this);

    }


    public void current(View view, String s)
    {
        tab=s;
        currentview=view;

    }
    @Override
    public void onClick(View v) {
        TextView textView=(TextView)currentview;
       // textView.setText(tab);
        Intent intent  = new Intent(v.getContext(),TableActivity.class);
Log.d("digvijay",tab);
        intent.putExtra("table No",tab);
        intent.putExtra("computation",data);
        v.getContext().startActivity(intent);

    }
}

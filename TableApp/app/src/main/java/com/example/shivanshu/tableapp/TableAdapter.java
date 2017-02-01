package com.example.shivanshu.tableapp;

import android.content.Context;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shivanshu on 1/21/2017.
 */

public class TableAdapter extends RecyclerView.Adapter<TableViewHolder> {
    private  static int count=2;
    public static String data=new ViewStrig().DataName;
    @Override
    public TableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.row_design,parent,false);
        return new TableViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TableViewHolder holder, int position)
    {

        String tableno=String.valueOf(position+1);

        holder.tablename.setText( data +" of "+ tableno);

        holder.current(holder.tablename, tableno);


    }

    @Override
    public int getItemCount() {
        return 20;
    }
}

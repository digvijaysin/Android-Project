package com.example.shivanshu.tableapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shivanshu on 1/21/2017.
 */

public class TablePrintAdapter extends RecyclerView.Adapter<TablePrintHolder> {

    String tablen= new TableActivity().tableno;
    static String comp=new TableActivity().process;
    Computation com=new Computation();
    @Override
    public TablePrintHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View tableview=inflater.inflate(R.layout.table_design,parent,false);

        return new TablePrintHolder(tableview);
    }

    @Override
    public void onBindViewHolder(TablePrintHolder holder, int position) {
        if (comp == comp) {

            String pos = String.valueOf(position + 1);
            int multipler = Integer.parseInt(tablen);
            int multiply = com.table(multipler, position);
            String mul = String.valueOf(multiply);
            holder.tableText.setText(tablen);
            holder.tableText1.setText(pos);
            holder.tableText2.setText(mul);

        }
        if (comp == "SQUARES") {
            String pos = String.valueOf(position + 1);
            int multipler = Integer.parseInt(tablen);
            int multiply = com.table(multipler, position);
            String mul = String.valueOf(multiply);
            holder.tableText.setText(tablen);
            holder.tableText1.setText(pos);
            holder.tableText2.setText(mul);

        }
        if (comp == "CUBES") {
            String pos = String.valueOf(position + 1);
            int multipler = Integer.parseInt(tablen);
            int multiply = com.table(multipler, position);
            String mul = String.valueOf(multiply);
            holder.tableText.setText(tablen);
            holder.tableText1.setText(pos);
            holder.tableText2.setText(mul);

        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }


}

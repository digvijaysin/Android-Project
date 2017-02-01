package com.example.shivanshu.tableapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shivanshu on 1/21/2017.
 */

public class TablePrintHolder extends RecyclerView.ViewHolder {

    TextView tableText;
    TextView tableText1;
    TextView tableText2;

    public TablePrintHolder(View itemView) {
        super(itemView);
        tableText=(TextView)itemView.findViewById(R.id.table_data);
        tableText1=(TextView)itemView.findViewById(R.id.table_data2);
        tableText2=(TextView)itemView.findViewById(R.id.table_data4);

    }
}

package com.datamation.kfdsfa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.datamation.kfdsfa.R;
import com.datamation.kfdsfa.model.Customer;

import java.util.ArrayList;

/**
 * Created by Rashmi on 11/20/2018.
 */

public class CustomerAdapter extends ArrayAdapter<Customer> {
    Context context;
    ArrayList<Customer> list;

    public CustomerAdapter(Context context, ArrayList<Customer> list) {

        super(context, R.layout.row_customer_listview, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(final int position, View row, final ViewGroup parent) {

        LayoutInflater inflater = null;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row = inflater.inflate(R.layout.row_customer_listview, parent, false);

        LinearLayout layout = (LinearLayout) row.findViewById(R.id.linearLayout);
        TextView code = (TextView) row.findViewById(R.id.debCode);
        TextView name = (TextView) row.findViewById(R.id.debName);
        TextView address = (TextView) row.findViewById(R.id.debAddress);


        code.setText(list.get(position).getCusCode());
        name.setText(list.get(position).getCusName());
        address.setText(list.get(position).getCusAdd1() + ", " + list.get(position).getCusAdd2() );

        return row;
    }
}
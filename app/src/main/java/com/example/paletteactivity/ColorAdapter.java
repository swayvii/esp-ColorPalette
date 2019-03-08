package com.example.paletteactivity;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    private int resourceLayout;
    private String[] colors;
    Context context;
    LayoutInflater mInflater;

    public ColorAdapter(Context context,int resource,String[] colors) {
        this.context = context;
        this.resourceLayout = resource;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = new View(context);

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(context);
            v = vi.inflate(resourceLayout, null);
        }

         TextView colorname = v.findViewById(R.id.color_name);
        ConstraintLayout background = v.findViewById(R.id.base_color);

        colorname.setText(colors[position]);
        background.setBackgroundColor(Color.parseColor(colors[position]));



        return v;


    }





}

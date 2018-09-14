package com.example.poojan.auctionsls;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Poojan on 23-12-2017.
 */

public class GridAdapter extends BaseAdapter {

    int[] teamimg;
    String[] teamplayers;
    Context context;

    public GridAdapter( Context context, int[] teamimg, String[] teamplayers) {
        this.teamimg = teamimg;
        this.teamplayers = teamplayers;
        this.context = context;
    }

    @Override
    public int getCount() {
        return teamplayers.length;
    }

    @Override
    public Object getItem(int i) {
        return teamplayers[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View gridView = convertView;
        if(convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_layout,null);
        }
        ImageView image = (ImageView)gridView.findViewById(R.id.imageView3);
        TextView text = (TextView)gridView.findViewById(R.id.textView6);
        image.setImageResource(teamimg[i]);
        text.setText(teamplayers[i]);
        return gridView;
    }
}

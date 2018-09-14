package com.example.poojan.auctionsls;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Poojan on 11-12-2017.
 */

public class MyAdapter extends ArrayAdapter {

    String[] captain_names;
    int[] images_img;
    Context context;
    public MyAdapter(@NonNull Context context, String[] captain_names, int[] images_img) {
        super(context,R.layout.listview_item);
        this.captain_names = captain_names;
        this.images_img = images_img;
        this.context = context;
    }

    @Override
    public int getCount() {
        return captain_names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent,false);
            ImageView img = (ImageView) convertView.findViewById(R.id.imageView);
            TextView txt = (TextView) convertView.findViewById(R.id.textView2);
            img.setImageResource(images_img[position]);
            txt.setText(captain_names[position]);
        }
            return convertView;

    }
}

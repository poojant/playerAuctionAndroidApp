package com.example.poojan.auctionsls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Main2Activity extends AppCompatActivity {

    GridView gridView;
    String[] teamplayer;
    int[] teamimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle mbundle = getIntent().getExtras();
        if(mbundle!=null)
        {
            teamplayer = mbundle.getStringArray("teamplayer");
            teamimg = mbundle.getIntArray("teamimg");
            gridView = (GridView)findViewById(R.id.gridview);
            GridAdapter adapter = new GridAdapter(Main2Activity.this,teamimg,teamplayer);
            gridView.setAdapter(adapter);
        }
    }
}

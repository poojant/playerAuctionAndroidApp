package com.example.poojan.auctionsls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Budget extends AppCompatActivity {

    int sunnybudget,sunnycount,rajubudget,rajucount,vickybudget,vickycount,hunnybudget,hunnycount,samaybudget,samaycount,
            amaybudget,amaycount;
    TextView sunnycol1,sunnycol2,rajucol1,rajucol2,vickycol1,vickycol2,hunnycol1,hunnycol2,samaycol1,samaycol2,
            amaycol1,amaycol2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {

            sunnybudget = bundle.getInt("sunnybudget");
            sunnycount = bundle.getInt("sunnycount");
            rajubudget = bundle.getInt("rajubudget");
            rajucount = bundle.getInt("rajucount");
            vickybudget = bundle.getInt("vickybudget");
            vickycount = bundle.getInt("vickycount");
            hunnybudget = bundle.getInt("hunnybudget");
            hunnycount = bundle.getInt("hunnycount");
            samaybudget = bundle.getInt("samaybudget");
            samaycount = bundle.getInt("samaycount");
            amaybudget = bundle.getInt("amaybudget");
            amaycount = bundle.getInt("amaycount");

            sunnycol1 = (TextView) findViewById(R.id.textView16);
            sunnycol2 = (TextView) findViewById(R.id.textView17);
            rajucol1 = (TextView) findViewById(R.id.textView19);
            rajucol2 = (TextView) findViewById(R.id.textView20);
            vickycol1 = (TextView) findViewById(R.id.textView22);
            vickycol2 = (TextView) findViewById(R.id.textView23);
            hunnycol1 = (TextView) findViewById(R.id.textView25);
            hunnycol2 = (TextView) findViewById(R.id.textView26);
            samaycol1 = (TextView) findViewById(R.id.textView28);
            samaycol2 = (TextView) findViewById(R.id.textView29);
            amaycol1 = (TextView) findViewById(R.id.textView31);
            amaycol2 = (TextView) findViewById(R.id.textView32);

            sunnycol1.setText(String.valueOf(9-sunnycount));
            sunnycol2.setText(String.valueOf(sunnybudget));
            rajucol1.setText(String.valueOf(9-rajucount));
            rajucol2.setText(String.valueOf(rajubudget));
            vickycol1.setText(String.valueOf(9-vickycount));
            vickycol2.setText(String.valueOf(vickybudget));
            hunnycol1.setText(String.valueOf(9-hunnycount));
            hunnycol2.setText(String.valueOf(hunnybudget));
            samaycol1.setText(String.valueOf(9-samaycount));
            samaycol2.setText(String.valueOf(samaybudget));
            amaycol1.setText(String.valueOf(9-amaycount));
            amaycol2.setText(String.valueOf(amaybudget));
        }
    }

}

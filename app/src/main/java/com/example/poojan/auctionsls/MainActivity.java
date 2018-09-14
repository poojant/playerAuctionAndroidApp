package com.example.poojan.auctionsls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabasesunny,mDatabaseraju,mDatabasevicky,mDatabasehunny,mDatabasesamay,mDatabaseamay;

    ListView lv;
    Button draft_btn;
    String[] captains = {"Sunny Shah","Raju Varliani","Vicky Varliani","Hunny Kalwani","Samay Turakhia","Amay Sheth"};
    int[] images = {R.drawable.capt_sunny,
            R.drawable.capt_raju,
            R.drawable.capt_vicky,
            R.drawable.capt_hunny,
            R.drawable.capt_samay,
            R.drawable.capt_amay};
    String sunny = "Team Sunny";
    String raju = "Team Raju";
    String vicky = "Team Vicky";
    String hunny = "Team Hunny";
    String samay = "Team Samay";
    String amay = "Team Amay";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            draft_btn = (Button)findViewById(R.id.button7);
            lv = (ListView) findViewById(R.id.listview);
            MyAdapter myAdapter = new MyAdapter(MainActivity.this, captains, images);
            lv.setAdapter(myAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    //ListIterator itr = list1.listIterator();
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    intent.putExtra("team",sunny);
                    //intent.putExtra("teamimg",sunnyteamimg);
                    startActivity(intent);
                }
                if(i==1) {
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    intent.putExtra("team",raju);
                    //intent.putExtra("teamimg",sunnyteamimg);
                    startActivity(intent);
                }
                if(i==2) {
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    intent.putExtra("team",vicky);
                    //intent.putExtra("teamimg",sunnyteamimg);
                    startActivity(intent);
                }
                if(i==3) {
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    intent.putExtra("team",hunny);
                    //intent.putExtra("teamimg",sunnyteamimg);
                    startActivity(intent);
                }
                if(i==4) {
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    intent.putExtra("team",samay);
                    //intent.putExtra("teamimg",sunnyteamimg);
                    startActivity(intent);
                }
                if(i==5) {
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    intent.putExtra("team",amay);
                    //intent.putExtra("teamimg",sunnyteamimg);
                    startActivity(intent);
                }
            }
        });

            draft_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,Player_Auction.class);
                    startActivity(intent);
                    }
            });
    }
}

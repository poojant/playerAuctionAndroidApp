package com.example.poojan.auctionsls;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Player_Auction extends AppCompatActivity implements View.OnClickListener {

    private DatabaseReference mDatabasesunny,mDatabaseraju,mDatabasevicky,mDatabasehunny,mDatabasesamay,mDatabaseamay;
    private DatabaseReference draft;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.menu1 : Intent intent = new Intent(Player_Auction.this, Teamsheet.class);
                /*intent.putExtra("sunnyteamplayer",sunnyteamplayer);
                intent.putExtra("sunnyteamimg",sunnyteamimg);
                intent.putExtra("rajuteamplayer",rajuteamplayer);
                intent.putExtra("rajuteamimg",rajuteamimg);
                intent.putExtra("vickyteamplayer",vickyteamplayer);
                intent.putExtra("vickyteamimg",vickyteamimg);
                intent.putExtra("hunnyteamplayer",hunnyteamplayer);
                intent.putExtra("hunnyteamimg",hunnyteamimg);
                intent.putExtra("samayteamplayer",samayteamplayer);
                intent.putExtra("samayteamimg",samayteamimg);
                intent.putExtra("amayteamplayer",amayteamplayer);
                intent.putExtra("amayteamimg",amayteamimg);*/
                startActivity(intent);
                break;

            case R.id.menu2 : Intent intent2 = new Intent(Player_Auction.this, Budget.class);
                intent2.putExtra("sunnybudget",sunnybudget);
                intent2.putExtra("sunnycount",sunnycount);
                intent2.putExtra("rajubudget",rajubudget);
                intent2.putExtra("rajucount",rajucount);
                intent2.putExtra("vickybudget",vickybudget);
                intent2.putExtra("vickycount",vickycount);
                intent2.putExtra("hunnybudget",hunnybudget);
                intent2.putExtra("hunnycount",hunnycount);
                intent2.putExtra("samaybudget",samaybudget);
                intent2.putExtra("samaycount",samaycount);
                intent2.putExtra("amaybudget",amaybudget);
                intent2.putExtra("amaycount",amaycount);
                startActivity(intent2);
                break;
        }
        return true;
    }

    int draftnumber;
    int count=0;
    int bidValue = 20;
    int playerCount = 1;
    int unsoldplayercount;
    int reunsoldplayercount;
    int totalplayerssold=0;
    int temp=0;
    int sunnycount=1;
    int rajucount=1;
    int vickycount=1;
    int hunnycount=1;
    int samaycount=1;
    int amaycount=1;
    int sunnybudget = 200;
    int rajubudget = 200;
    int vickybudget = 200;
    int hunnybudget = 200;
    int samaybudget = 200;
    int amaybudget = 200;
    static Button btnsunny,btnraju,btnvicky,btnhunny,btnsamay,btnamay,btnbid,btnunsold;
    TextView draft_number,playername,bidamt;
    ImageView playerimg;
    /*String[] players = {"Chirag","Rahul B","Rushabh","Harsh","Vinod","Riddhesh",
            "Aman J","Poojan","Prem","Bavish","Keval","Hardik S",
            "Deepak M","Mitesh","Mehul","Bhavesh B","Deepak B","Arnish",
            "Yash","Pujesh","Hardik","Shrenik","Vinit","Ankit J",
            "Bhavin","Ramesh","Aditya","Umang S","Bhavesh S","Aashish",
            "Vipul","Amit","Ravi","Manoj S","Prakash","Nilesh M",
            "Rahul S","Sachin","Ajay","Jay","Manoj K","Mehul S",
            "Vishva","Aayush","Karan","Rohan","Akshat","Lakshit"};*/

    int[] images = { R.drawable.player_chirag,R.drawable.player_rahulbakh,R.drawable.player_rushabh,
            R.drawable.player_landya,R.drawable.player_vinod, R.drawable.player_riddhesh,
            R.drawable.player_aman,R.drawable.player_poojan, R.drawable.player_prem,
            R.drawable.player_bavish ,R.drawable.player_keval, R.drawable.player_vishnu,
            R.drawable.player_deepakmayekar, R.drawable.player_mitesh, R.drawable.player_mehulvor,
            R.drawable.player_bhaveshbha, R.drawable.player_pandu, R.drawable.player_arnish,
            R.drawable.player_yashkal, R.drawable.player_pujesh, R.drawable.player_nani,
            R.drawable.player_shrenik, R.drawable.player_vinit, R.drawable.player_ankit,
            R.drawable.player_bhavin, R.drawable.player_ramesh, R.drawable.player_adi,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.player_aashish,
            R.drawable.player_vipul, R.drawable.player_amit, R.drawable.player_ravi,
            R.drawable.player_manojsaj, R.drawable.player_prakash, R.drawable.player_nilesh,
            R.drawable.player_rahulsha,R.drawable.player_sachin, R.drawable.player_babu,
            R.drawable.player_jay, R.drawable.ic_launcher_background, R.drawable.player_mehulsh,
            R.drawable.player_vishva, R.drawable.player_aayush, R.drawable.player_dhiru,
            R.drawable.player_rohan, R.drawable.player_akshat, R.drawable.player_lakshit};

    String[] sunnyteamplayer = new String[10];
    int[] sunnyteamimg = new int[10];
    String[] rajuteamplayer = new String[10];
    int[] rajuteamimg = new int[10];
    String[] vickyteamplayer = new String[10];
    int[] vickyteamimg = new int[10];
    String[] hunnyteamplayer = new String[10];
    int[] hunnyteamimg = new int[10];
    String[] samayteamplayer = new String[10];
    int[] samayteamimg = new int[10];
    String[] amayteamplayer = new String[10];
    int[] amayteamimg = new int[10];
    String[] unsoldplayers = new String[10];
    int[] unsoldimages = new int[10];

    /*public Player_Auction(int count, String[] players) {
        this.count = count;
        this.players = players;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player__auction);


        btnsunny = (Button) findViewById(R.id.button);
        btnsunny.setOnClickListener(this);
        btnraju = (Button) findViewById(R.id.button2);
        btnraju.setOnClickListener(this);
        btnvicky = (Button) findViewById(R.id.button3);
        btnvicky.setOnClickListener(this);
        btnhunny = (Button) findViewById(R.id.button4);
        btnhunny.setOnClickListener(this);
        btnsamay = (Button) findViewById(R.id.button5);
        btnsamay.setOnClickListener(this);
        btnamay = (Button) findViewById(R.id.button6);
        btnamay.setOnClickListener(this);
        btnbid = (Button) findViewById(R.id.button8);
        btnbid.setOnClickListener(this);
        btnunsold = (Button) findViewById(R.id.button9);
        btnunsold.setOnClickListener(this);
        draft_number = (TextView) findViewById(R.id.textView3);
        playername = (TextView)findViewById(R.id.textView5);
        bidamt = (TextView)findViewById(R.id.textView4);
        playerimg = (ImageView) findViewById(R.id.imageView2);
        btnhunny.setEnabled(false);

        getData();

    }

    public void getData(){
        draftnumber = (count/6) + 1;
        draft_number.setText("Draft "+draftnumber);
        draft = FirebaseDatabase.getInstance().getReference().child("Draft"+draftnumber);
        draft.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot snapshot : dataSnapshot.getChildren()){
                    if(snapshot.getKey().equals("player"+count)){
                        String playerName = snapshot.getValue(String.class);
                        playername.setText(playerName);
                        playerimg.setImageResource(images[count]);
                        bidValue = 20;
                        bidamt.setText(String.valueOf(bidValue));
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    @Override
    public void onClick(View view) {
        Log.d("count", String.valueOf(count));
        switch(view.getId()){
            case R.id.button :  String playerOfSunny = playername.getText().toString();
                mDatabasesunny = FirebaseDatabase.getInstance().getReference().child("TeamSunny").child(playerOfSunny);
                mDatabasesunny.setValue(bidamt.getText().toString());
                count++;
                getData();
                break;

            case R.id.button2 :  String playerOfRaju = playername.getText().toString();
                mDatabasesunny = FirebaseDatabase.getInstance().getReference().child("TeamRaju");
                mDatabasesunny.child(playerOfRaju).setValue(bidamt.getText().toString());
                count++;
                getData();
                break;

            case R.id.button3 :  String playerOfVicky = playername.getText().toString();
                mDatabasesunny = FirebaseDatabase.getInstance().getReference().child("TeamVicky");
                mDatabasesunny.child(playerOfVicky).setValue(bidamt.getText().toString());
                count++;
                getData();
                break;

            case R.id.button4 :  String playerOfHunny = playername.getText().toString();
                mDatabasesunny = FirebaseDatabase.getInstance().getReference().child("TeamHunny");
                mDatabasesunny.child(playerOfHunny).setValue(bidamt.getText().toString());
                count++;
                getData();
                break;

            case R.id.button5 :  String playerOfSamay = playername.getText().toString();
                mDatabasesunny = FirebaseDatabase.getInstance().getReference().child("TeamSamay");
                mDatabasesunny.child(playerOfSamay).setValue(bidamt.getText().toString());
                count++;
                getData();
                break;

            case R.id.button6 :  String playerOfAmay = playername.getText().toString();
                mDatabasesunny = FirebaseDatabase.getInstance().getReference().child("TeamAmay");
                mDatabasesunny.child(playerOfAmay).setValue(bidamt.getText().toString());
                count++;
                getData();
                break;

            case R.id.button8 :  bidValue++;
                bidamt.setText(String.valueOf(bidValue));
                break;

        }
    }
}


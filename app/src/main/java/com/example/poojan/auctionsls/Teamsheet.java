package com.example.poojan.auctionsls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teamsheet extends AppCompatActivity {

    String sunny = "Team Sunny";
    String raju = "Team Raju";
    String vicky = "Team Vicky";
    String hunny = "Team Hunny";
    String samay = "Team Samay";
    String amay = "Team Amay";

    Button btn,btn2,btn3,btn4,btn5,btn6;
    String[] sunnyteamplayer;
    int[] sunnyteamimg;
    String[] rajuteamplayer;
    int[] rajuteamimg;
    String[] vickyteamplayer;
    int[] vickyteamimg;
    String[] hunnyteamplayer;
    int[] hunnyteamimg;
    String[] samayteamplayer;
    int[] samayteamimg;
    String[] amayteamplayer;
    int[] amayteamimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teamsheet);

        //Bundle bundle = getIntent().getExtras();
        //if(bundle!=null) {
            /*sunnyteamplayer = bundle.getStringArray("sunnyteamplayer");
            sunnyteamimg = bundle.getIntArray("sunnyteamimg");
            rajuteamplayer = bundle.getStringArray("rajuteamplayer");
            rajuteamimg = bundle.getIntArray("rajuteamimg");
            vickyteamplayer = bundle.getStringArray("vickyteamplayer");
            vickyteamimg = bundle.getIntArray("vickyteamimg");
            hunnyteamplayer = bundle.getStringArray("hunnyteamplayer");
            hunnyteamimg = bundle.getIntArray("hunnyteamimg");
            samayteamplayer = bundle.getStringArray("samayteamplayer");
            samayteamimg = bundle.getIntArray("samayteamimg");
            amayteamplayer = bundle.getStringArray("amayteamplayer");
            amayteamimg = bundle.getIntArray("amayteamimg");*/

            btn = (Button) findViewById(R.id.button10);
            btn2 = (Button) findViewById(R.id.button11);
            btn3 = (Button) findViewById(R.id.button12);
            btn4 = (Button) findViewById(R.id.button13);
            btn5 = (Button) findViewById(R.id.button14);
            btn6 = (Button) findViewById(R.id.button15);


            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Teamsheet.this,Main3Activity.class);
                    intent.putExtra("team",sunny);
                    intent.putExtra("teamplayer",sunnyteamplayer);
                    intent.putExtra("teamimg",sunnyteamimg);
                    startActivity(intent);
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Teamsheet.this,Main3Activity.class);
                    intent.putExtra("team",raju);
                    intent.putExtra("teamplayer",rajuteamplayer);
                    intent.putExtra("teamimg",rajuteamimg);
                    startActivity(intent);

                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Teamsheet.this,Main3Activity.class);
                    intent.putExtra("team",vicky);
                    intent.putExtra("teamplayer",vickyteamplayer);
                    intent.putExtra("teamimg",vickyteamimg);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Teamsheet.this,Main3Activity.class);
                    intent.putExtra("team",hunny);
                    intent.putExtra("teamplayer",hunnyteamplayer);
                    intent.putExtra("teamimg",hunnyteamimg);
                    startActivity(intent);
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Teamsheet.this,Main3Activity.class);
                    intent.putExtra("team",samay);
                    intent.putExtra("teamplayer",samayteamplayer);
                    intent.putExtra("teamimg",samayteamimg);
                    startActivity(intent);
                }
            });
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Teamsheet.this,Main3Activity.class);
                    intent.putExtra("team",amay);
                    intent.putExtra("teamplayer",amayteamplayer);
                    intent.putExtra("teamimg",amayteamimg);
                    startActivity(intent);
                }
            });

        }
    }


//}


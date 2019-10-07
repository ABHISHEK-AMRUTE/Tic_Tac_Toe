package com.tictactoe.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class player2win extends AppCompatActivity {
    Button bute1;
    AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player2win);
        bute1=findViewById(R.id.button4);
        mAdView = findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        final MediaPlayer mp1= MediaPlayer.create(this, R.raw.bensoundpopdance);
        mp1.start();
        bute1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.stop();
                startActivity(new Intent(player2win.this,Main2Activity.class));
                finish();
            }
        });



    }

    @Override
    public void onBackPressed() {

    }
}

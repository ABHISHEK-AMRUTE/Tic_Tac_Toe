package com.tictactoe.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class player1win extends AppCompatActivity {
Button bute;
AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player1win);
        bute=findViewById(R.id.button2);
        mAdView = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        final MediaPlayer mp1= MediaPlayer.create(this, R.raw.bensoundpopdance);
        mp1.start();
        bute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {mp1.stop();
                startActivity(new Intent(player1win.this,Main2Activity.class));
            }
        });
    }
    @Override
    public void onBackPressed() {

    }
}

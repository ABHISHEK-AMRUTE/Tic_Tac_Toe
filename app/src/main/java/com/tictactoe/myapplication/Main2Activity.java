package com.tictactoe.myapplication;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Main2Activity extends AppCompatActivity {
ImageButton a1;
    boolean doubleBackToExitPressedOnce = false;
int volume_lev=1;
TextView text;
    MediaPlayer mp1,mp2,mp3;
    ImageButton b1,volumeb;
    ImageButton c1;
    ImageButton d1;
    ImageButton e1;
    ImageButton f1;
    ImageButton g1;
    ImageButton h1;
    ImageButton but;

    ImageButton i1;
    int player1=0;
    int flag=0;
    int flag2=0;
    int flag3=0;
    int flag4=0;
    int flag5=0;
    int flag6=0;
    int flag7=0;
    int flag8=0;
    int flag9=0;


           AdView mAdView;
    int a,b,c,d,e,f,g,h,i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a1=findViewById(R.id.a);
        b1=findViewById(R.id.b);
        c1=findViewById(R.id.c);
        d1=findViewById(R.id.d);
        e1=findViewById(R.id.e);
        f1=findViewById(R.id.f);
        g1=findViewById(R.id.g);
        h1=findViewById(R.id.h);
        i1=findViewById(R.id.i);
        volumeb=findViewById(R.id.volume);
        volumeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(volume_lev==1)
                {   AudioManager amanager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
                    amanager.setStreamMute(AudioManager.STREAM_MUSIC, true);
                    volume_lev=0;
                    volumeb.setBackground(getResources().getDrawable(R.drawable.mute));
                }
                else
                {AudioManager amanager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
                    amanager.setStreamMute(AudioManager.STREAM_MUSIC, false);
                    volumeb.setBackground(getResources().getDrawable(R.drawable.full_volume));
                    volume_lev=1;
                }
            }
        });




        mp1= MediaPlayer.create(this,R.raw.bensoundsummer);
        mp2= MediaPlayer.create(this, R.raw.click);
        mp3= MediaPlayer.create(this, R.raw.clickone);
final Button about,help;
        about=findViewById(R.id.button5);
        help=findViewById(R.id.button);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.stop();
                startActivity(new Intent(Main2Activity.this, about.class));
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { mp1.stop();
                String url = "https://play.google.com/store/apps/developer?id=ABHISHEK+AMRUTE";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mp1.start();
        text=findViewById(R.id.textView);
        but =findViewById(R.id.Button3);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.stop();
                finish();
                startActivity(new Intent(Main2Activity.this,Main2Activity.class));
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    if (player1 % 2 == 0) {
                        mp2.start();
                        a1.setImageResource(R.drawable.circle);a=2;
                        check();
                        text.setText("PLAYER TWO CHANCE");
                    } else {mp3.start();
                        a1.setImageResource(R.drawable.cross);a=1;check();text.setText("PLAYER ONE CHANCE");
                    }
                    flag=1;
                    player1++;
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag2==0) {
                    if (player1 % 2 == 0) {  mp2.start();
                        b1.setImageResource(R.drawable.circle);b=2;check();
                        text.setText("PLAYER TWO CHANCE");
                    } else {mp3.start();
                        b1.setImageResource(R.drawable.cross);b=1;check();text.setText("PLAYER ONE CHANCE");
                    }
                    flag2=1;
                    player1++;
                }
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag3==0) {
                    if (player1 % 2 == 0) {  mp2.start();
                        c1.setImageResource(R.drawable.circle);c=2;
                        mp1.stop();check();mp1.start();
                        text.setText("PLAYER TWO CHANCE");
                    } else {mp3.start();
                        c1.setImageResource(R.drawable.cross);c=1; mp1.stop();check();mp1.start();;text.setText("PLAYER ONE CHANCE");
                    }
                    flag3=1;
                    player1++;
                }
            }
        });
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag4==0) {
                    if (player1 % 2 == 0) {  mp2.start();
                        d1.setImageResource(R.drawable.circle);d=2; mp1.stop();check();mp1.start();
                        text.setText("PLAYER TWO CHANCE");
                    } else {mp3.start();
                        d1.setImageResource(R.drawable.cross);d=1; mp1.stop();check();mp1.start();text.setText("PLAYER ONE CHANCE");
                    }
                    flag4=1;
                    player1++;
                }
            }
        });
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag5==0) {
                    if (player1 % 2 == 0) {  mp2.start();
                        e1.setImageResource(R.drawable.circle);e=2; mp1.stop();check();mp1.start();
                        text.setText("PLAYER TWO CHANCE");
                    } else {mp3.start();
                        e1.setImageResource(R.drawable.cross);e=1; mp1.stop();check();mp1.start();text.setText("PLAYER ONE CHANCE");
                    }
                    flag5=1;
                    player1++;
                }
            }
        });
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag6==0) {
                    if (player1 % 2 == 0) {  mp2.start();
                        f1.setImageResource(R.drawable.circle);f=2; mp1.stop();check();mp1.start();
                        text.setText("PLAYER TWO CHANCE");
                    } else {mp3.start();
                        f1.setImageResource(R.drawable.cross);f=1; mp1.stop();check();mp1.start();text.setText("PLAYER ONE CHANCE");
                    }
                    flag6=1;
                    player1++;
                }
            }
        });
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag7==0) {
                    if (player1 % 2 == 0) {  mp2.start();
                        g1.setImageResource(R.drawable.circle);g=2; mp1.stop();check();mp1.start();
                        text.setText("PLAYER TWO CHANCE");
                    } else {mp3.start();
                        g1.setImageResource(R.drawable.cross);g=1; mp1.stop();check();mp1.start();text.setText("PLAYER ONE CHANCE");
                    }
                    flag7=1;
                    player1++;
                }
            }
        });
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag8==0) {
                    if (player1 % 2 == 0) {  mp2.start();
                        h1.setImageResource(R.drawable.circle);h=2; mp1.stop();check();mp1.start();
                        text.setText("PLAYER TWO CHANCE");
                    } else {mp3.start();
                        h1.setImageResource(R.drawable.cross);h=1; mp1.stop();check();mp1.start();text.setText("PLAYER ONE CHANCE");
                    }
                    flag8=1;
                    player1++;
                }
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag9==0) {
                    if (player1 % 2 == 0) {  mp2.start();
                        i1.setImageResource(R.drawable.circle);i=2; mp1.stop();check();mp1.start();
                        text.setText("PLAYER TWO CHANCE");
                    } else {mp3.start();
                        i1.setImageResource(R.drawable.cross);i=1; mp1.stop();check();mp1.start();text.setText("PLAYER ONE CHANCE");
                    }
                    flag9=1;
                    player1++;
                }
            }
        });

    }
    public void check()
    {
        if((a==1&&b==1&&c==1)||(d==1&&e==1&&f==1)||(g==1&&h==1&&i==1)||(a==1&&d==1&&g==1)||(b==1&&e==1&&h==1)||(c==1&&f==1&&i==1)||(a==1&&e==1&&i==1)||(g==1&&e==1&&c==1))
        {
         startActivity(new Intent(Main2Activity.this,player2win.class));
        }
        else if((a==2&&b==2&&c==2)||(d==2&&e==2&&f==2)||(g==2&&h==2&&i==2)||(a==2&&d==2&&g==2)||(b==2&&e==2&&h==2)||(c==2&&f==2&&i==2)||(a==2&&e==2&&i==2)||(g==2&&e==2&&c==2))
        {
            startActivity(new Intent(Main2Activity.this,player1win.class));
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp1.stop();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mp1.stop();
    }

    @Override
    public void onBackPressed() {
        mp1.stop();
        if (doubleBackToExitPressedOnce) {
            finish();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);

    }
}

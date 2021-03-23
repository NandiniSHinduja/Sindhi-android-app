package com.example.sindhi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
    }
    public void colorplay1(View view)
    {
        MediaPlayer color1 = MediaPlayer.create(this, R.raw.karo);;
        color1.start();

    }
    public void colorplay2(View view)
    {
        MediaPlayer color2 = MediaPlayer.create(this, R.raw.badamirang);;
        color2.start();

    }
    public void colorplay3(View view)
    {
        MediaPlayer color3= MediaPlayer.create(this, R.raw.shakhi);;
        color3.start();

    }
    public void colorplay4(View view)
    {
        MediaPlayer color4 = MediaPlayer.create(this, R.raw.khakhi);;
        color4.start();

    }
    public void colorplay5(View view)
    {
        MediaPlayer color5= MediaPlayer.create(this, R.raw.saao);;
        color5.start();

    }
    public void colorplay6(View view)
    {
        MediaPlayer color6 = MediaPlayer.create(this, R.raw.pelo);;
        color6.start();

    }
    public void colorplay7(View view)
    {
        MediaPlayer color7 = MediaPlayer.create(this, R.raw.garo);;
        color7.start();

    }
    public void colorplay8(View view)
    {
        MediaPlayer color8= MediaPlayer.create(this, R.raw.acho);;
        color8.start();

    }



}
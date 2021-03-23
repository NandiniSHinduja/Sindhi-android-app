package com.example.sindhi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
    }
    public void colorplay11(View view)
    {
        MediaPlayer color11 = MediaPlayer.create(this, R.raw.one);;
        color11.start();

    }
    public void colorplay12(View view)
    {
        MediaPlayer color12 = MediaPlayer.create(this, R.raw.two);;
        color12.start();

    }
    public void colorplay13(View view)
    {
        MediaPlayer color13 = MediaPlayer.create(this, R.raw.three);;
        color13.start();

    }
    public void colorplay14(View view)
    {
        MediaPlayer color14 = MediaPlayer.create(this, R.raw.four);;
        color14.start();

    }
    public void colorplay15(View view)
    {
        MediaPlayer color15 = MediaPlayer.create(this, R.raw.five);;
        color15.start();

    }
    public void colorplay16(View view)
    {
        MediaPlayer color16 = MediaPlayer.create(this, R.raw.six);;
        color16.start();

    }
    public void colorplay17(View view)
    {
        MediaPlayer color17 = MediaPlayer.create(this, R.raw.yes);;
        color17.start();

    }
    public void colorplay18(View view)
    {
        MediaPlayer color18 = MediaPlayer.create(this, R.raw.no);;
        color18.start();

    }
    public void colorplay19(View view)
    {
        MediaPlayer color19 = MediaPlayer.create(this, R.raw.nine);;
        color19.start();

    }
    public void colorplay20(View view)
    {
        MediaPlayer color20 = MediaPlayer.create(this, R.raw.ten);;
        color20.start();

    }
}
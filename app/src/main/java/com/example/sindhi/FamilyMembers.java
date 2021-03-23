package com.example.sindhi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
    }
    public void musicplay11(View view)
    {
        MediaPlayer music11 = MediaPlayer.create(this, R.raw.rec1);;
        music11.start();

    }
    public void musicplay12(View view)
    {
        MediaPlayer music12 = MediaPlayer.create(this, R.raw.rec2);;
        music12.start();

    }
    public void musicplay13(View view)
    {
        MediaPlayer music13 = MediaPlayer.create(this, R.raw.rec3);;
        music13.start();

    }
    public void musicplay14(View view)
    {
        MediaPlayer music14 = MediaPlayer.create(this, R.raw.rec4);;
        music14.start();

    }
    public void musicplay15(View view)
    {
        MediaPlayer music15 = MediaPlayer.create(this, R.raw.rec5);;
        music15.start();

    }
    public void musicplay16(View view)
    {
        MediaPlayer music16 = MediaPlayer.create(this, R.raw.rec6);;
        music16.start();

    }
    public void musicplay17(View view)
    {
        MediaPlayer music17 = MediaPlayer.create(this, R.raw.rec7);;
        music17.start();

    }
    public void musicplay18(View view)
    {
        MediaPlayer music18 = MediaPlayer.create(this, R.raw.rec8);;
        music18.start();

    }
    public void musicplay19(View view)
    {
        MediaPlayer music19 = MediaPlayer.create(this, R.raw.rec9);;
        music19.start();

    }
    public void musicplay20(View view)
    {
        MediaPlayer music20 = MediaPlayer.create(this, R.raw.rec10);;
        music20.start();

    }
}
package com.example.sindhi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers<itemsAdapter> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

    }
    public void musicplay1(View view)
    {
        MediaPlayer music1 = MediaPlayer.create(this, R.raw.hiku);;
        music1.start();

    }
    public void musicplay2(View view)
    {
        MediaPlayer music2 = MediaPlayer.create(this, R.raw.ba);
        music2.start();

    }

    public void musicplay3(View view)
    {
        MediaPlayer music3=MediaPlayer.create(this, R.raw.te);;
        music3.start();

    }
    public void musicplay4(View view)
    {
        MediaPlayer music4=MediaPlayer.create(this, R.raw.chaar);
        music4.start();

    }
    public void musicplay5(View view)
    {
        MediaPlayer music5= MediaPlayer.create(this, R.raw.panj);
        music5.start();
    }
    public void musicplay6(View view)
    {
        MediaPlayer music6=MediaPlayer.create(this, R.raw.chhah);
        music6.start();
    }
    public void musicplay7(View view)
    {
        MediaPlayer music7=MediaPlayer.create(this, R.raw.sat);
        music7.start();
    }
    public void musicplay8(View view)
    {
        MediaPlayer music8=MediaPlayer.create(this, R.raw.attha);
        music8.start();
    }
    public void musicplay9(View view)
    {
        MediaPlayer music9=MediaPlayer.create(this, R.raw.nav);
        music9.start();

    }
    public void musicplay10(View view)
    {
        MediaPlayer music10=MediaPlayer.create(this, R.raw.dah);
        music10.start();

    }





}
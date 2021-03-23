package com.example.sindhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myListener(View view){
        Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
        startActivity(numbersIntent);
    }
    public void myListener2(View view){
        Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
        startActivity(colorsIntent);
    }
    public void myListener3(View view){
        Intent familymembersIntent = new Intent(MainActivity.this, FamilyMembers.class);
        startActivity(familymembersIntent);
    }
    public void myListener4(View view){
        Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class);
        startActivity(phrasesIntent);
    }

    private void doSomeStuff() {
    }
}
package com.ap.apapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);
    }

    public void clickRS(View view) {
        Intent i = new Intent (this, RS.class);
        startActivity(i);
    }

    public void clickPOL(View view) {
        Intent i = new Intent (this, polisi.class);
        startActivity(i);
    }

    public void clickSUPMARKET(View view) {
        Intent i = new Intent (this, supmarket.class);
        startActivity(i);
    }

    public void clickSEKOLAH(View view) {
        Intent i = new Intent (this, sekolah.class);
        startActivity(i);
    }
}
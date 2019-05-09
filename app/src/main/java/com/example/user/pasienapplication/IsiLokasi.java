package com.example.user.pasienapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IsiLokasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_lokasi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Maps");

    }
}

package com.example.user.pasienapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IsiResep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_resep);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Resep Detail");


    }
}

package com.example.user.pasienapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AddKeluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_keluarga);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ADD KELUARGA");
    }
}

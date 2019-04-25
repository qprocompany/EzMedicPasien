package com.example.user.pasienapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenuPembelianObat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pembelian_obat);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Order");
    }
}

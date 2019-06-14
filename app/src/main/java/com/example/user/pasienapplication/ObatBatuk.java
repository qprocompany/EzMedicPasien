package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ObatBatuk extends AppCompatActivity {

    Button bebasobat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat_batuk);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Obat Batuk");

        bebasobat = (Button) findViewById(R.id.bebasobat);
        bebasobat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(ObatBatuk.this, PembayaranObatBebas.class);
                startActivity(intent);
            }
        });
    }
}

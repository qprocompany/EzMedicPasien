package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TambahAlamat extends AppCompatActivity {

    LinearLayout TambahAlamatBaru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_alamat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tambah Alamat");

        TambahAlamatBaru = (LinearLayout) findViewById(R.id.TambahAlamatBaru);
        TambahAlamatBaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(TambahAlamat.this, IsiGantiAlamat.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class IsiGantiAlamat extends AppCompatActivity {

    LinearLayout UbahAlamat,UbahAlamat2,TambahAlamatBaru,alamat,alamat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_ganti_alamat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tujuan Pengiriman");

        UbahAlamat = (LinearLayout) findViewById(R.id.UbahAlamat);
        UbahAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiGantiAlamat.this, TambahAlamat.class);
                startActivity(intent);
            }
        });

        UbahAlamat2 = (LinearLayout) findViewById(R.id.UbahAlamat2);
        UbahAlamat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiGantiAlamat.this, TambahAlamat.class);
                startActivity(intent);
            }
        });

        TambahAlamatBaru = (LinearLayout) findViewById(R.id.TambahAlamatBaru);
        TambahAlamatBaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiGantiAlamat.this, TambahAlamat.class);
                startActivity(intent);
            }
        });

        alamat = (LinearLayout) findViewById(R.id.alamat);
        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiGantiAlamat.this, IsiResep.class);
                startActivity(intent);
            }
        });

        alamat2 = (LinearLayout) findViewById(R.id.alamat2);
        alamat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiGantiAlamat.this, IsiResep.class);
                startActivity(intent);
            }
        });

    }
}

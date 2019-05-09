package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ResepDokter extends AppCompatActivity {

    LinearLayout detailResep,isiGantiAlamat;;
    Button orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_dokter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Resep Dokter");

        orders = (Button) findViewById(R.id.orders);
        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(ResepDokter.this, IsiOrderResepDokter.class);
                startActivity(intent);
            }
        });

        isiGantiAlamat = (LinearLayout) findViewById(R.id.GantiAlamat);
        isiGantiAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(ResepDokter.this, IsiGantiAlamat.class);
                startActivity(intent);
            }
        });

        detailResep = (LinearLayout) findViewById(R.id.detailResep);
        detailResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(ResepDokter.this, IsiResep.class);
                startActivity(intent);
            }
        });

    }
}

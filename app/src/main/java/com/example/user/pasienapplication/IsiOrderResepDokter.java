package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class IsiOrderResepDokter extends AppCompatActivity {

    Button popOrder, popCekHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_order_resep_dokter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Apotik");

        popOrder = (Button) findViewById(R.id.popOrder);
        popOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiOrderResepDokter.this, PopOrder.class);
                startActivity(intent);
            }
        });

        popCekHarga = (Button) findViewById(R.id.popCekHarga);
        popCekHarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiOrderResepDokter.this, PopCekHarga.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class PembayaranObatBebas extends AppCompatActivity {


    LinearLayout isiGantiAlamat;
    RadioGroup radioGroup;
    Button orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran_obat_bebas);

        getSupportActionBar().setTitle("Resep Dokter");

        radioGroup = (RadioGroup) findViewById(R.id.RadioGender);

        orders = (Button) findViewById(R.id.orders);
        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(PembayaranObatBebas.this, PopOrder.class);
                startActivity(intent);
            }
        });

        isiGantiAlamat = (LinearLayout) findViewById(R.id.GantiAlamat);
        isiGantiAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(PembayaranObatBebas.this, IsiGantiAlamat.class);
                startActivity(intent);
            }
        });
    }
}

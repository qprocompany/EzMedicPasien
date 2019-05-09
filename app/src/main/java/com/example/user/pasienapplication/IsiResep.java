package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class IsiResep extends AppCompatActivity {

    LinearLayout popEmail,popEmail1,popEmail2,popEmail3, isiGantiAlamat;
    Button orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_resep);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Resep Detail");

        orders = (Button) findViewById(R.id.orders);
        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiResep.this, IsiOrderResepDokter.class);
                startActivity(intent);
            }
        });

        isiGantiAlamat = (LinearLayout) findViewById(R.id.GantiAlamat);
        isiGantiAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiResep.this, IsiGantiAlamat.class);
                startActivity(intent);
            }
        });

        popEmail = (LinearLayout) findViewById(R.id.popEmail);
        popEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiResep.this, PopEmail.class);
                startActivity(intent);
            }
        });

        popEmail1 = (LinearLayout) findViewById(R.id.popEmail1);
        popEmail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiResep.this, PopEmail.class);
                startActivity(intent);
            }
        });

        popEmail2 = (LinearLayout) findViewById(R.id.popEmail2);
        popEmail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiResep.this, PopEmail.class);
                startActivity(intent);
            }
        });

        popEmail3 = (LinearLayout) findViewById(R.id.popEmail3);
        popEmail3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiResep.this, PopEmail.class);
                startActivity(intent);
            }
        });

    }
}

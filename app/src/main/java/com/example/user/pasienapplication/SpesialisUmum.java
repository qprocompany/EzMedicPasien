package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SpesialisUmum extends AppCompatActivity {

    LinearLayout dokter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesialis_umum);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Spesialis Umum");


        dokter1 = (LinearLayout) findViewById(R.id.dokter1);
        dokter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(SpesialisUmum.this, IsiDokter.class);
                startActivity(intent);
            }
        });
    }
}

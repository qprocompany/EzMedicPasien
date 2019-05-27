package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PembayaranAppointmentDokter extends AppCompatActivity {

    Button btnPembayaranDokter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran_appointment_dokter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pembayaran");


        btnPembayaranDokter = (Button) findViewById(R.id.btnPembayaranDokter);
        btnPembayaranDokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(PembayaranAppointmentDokter.this, FormRatingDokter.class);
                startActivity(intent);
            }
        });
    }
}

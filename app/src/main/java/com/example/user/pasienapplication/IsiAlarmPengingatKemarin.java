package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class IsiAlarmPengingatKemarin extends AppCompatActivity {

    LinearLayout IsiAlarmSekarang, IsiAlarmBesok;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_alarm_pengingat_kemarin);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pengingat");

        IsiAlarmSekarang = (LinearLayout) findViewById(R.id.HariIni);
        IsiAlarmSekarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiAlarmPengingatKemarin.this, IsiAlarmPengingat.class);
                startActivity(intent);
            }
        });

        IsiAlarmBesok = (LinearLayout) findViewById(R.id.HariBesok);
        IsiAlarmBesok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiAlarmPengingatKemarin.this, IsiAlarmPengingatBesok.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.buttonTambahAlarm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiAlarmPengingatKemarin.this, PopAlarmTambah.class);
                startActivity(intent);
            }
        });
    }
}

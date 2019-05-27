package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class IsiAlarmPengingatBesok extends AppCompatActivity {

    LinearLayout IsiAlarmSekarang, IsiAlarmKemarin;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_alarm_pengingat_besok);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pengingat");

        IsiAlarmSekarang = (LinearLayout) findViewById(R.id.HariIni);
        IsiAlarmSekarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiAlarmPengingatBesok.this, IsiAlarmPengingat.class);
                startActivity(intent);
            }
        });

        IsiAlarmKemarin = (LinearLayout) findViewById(R.id.HariKemarin);
        IsiAlarmKemarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiAlarmPengingatBesok.this, IsiAlarmPengingatKemarin.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.buttonTambahAlarm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiAlarmPengingatBesok.this, PopAlarmTambah.class);
                startActivity(intent);
            }
        });
    }
}

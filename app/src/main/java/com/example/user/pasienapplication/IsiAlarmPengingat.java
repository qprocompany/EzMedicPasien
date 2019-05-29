package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class IsiAlarmPengingat extends AppCompatActivity {

    LinearLayout IsiAlarmKemarin, IsiAlarmBesok, KeteranganAlarm;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_alarm_pengingat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pengingat");

        IsiAlarmKemarin = (LinearLayout) findViewById(R.id.HariKemarin);
        IsiAlarmKemarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiAlarmPengingat.this, IsiAlarmPengingatKemarin.class);
                startActivity(intent);
            }
        });

        IsiAlarmBesok = (LinearLayout) findViewById(R.id.HariBesok);
        IsiAlarmBesok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiAlarmPengingat.this, IsiAlarmPengingatBesok.class);
                startActivity(intent);
            }
        });

//        KeteranganAlarm = (LinearLayout) findViewById(R.id.KeteranganAlarm);
//        KeteranganAlarm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(IsiAlarmPengingat.this, PopAlarmKet.class);
//                startActivity(intent);
//            }
//        });

        button = (Button) findViewById(R.id.buttonTambahAlarm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(IsiAlarmPengingat.this, PopAlarmTambah.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class IsiHistoryCekLab extends AppCompatActivity {

    LinearLayout historylistpasien, beliobatHistory, appointHistory, radiologiHistory, ceklabHistory;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_history_cek_lab);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("History Cek Lab");

        beliobatHistory = (LinearLayout) findViewById(R.id.beliobatHistory);
        beliobatHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiHistoryCekLab.this, IsiHistoryObat.class);
                startActivity(intent);
            }
        });

        appointHistory = (LinearLayout) findViewById(R.id.appointHistory);
        appointHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiHistoryCekLab.this, IsiHistoryAppoint.class);
                startActivity(intent);
            }
        });


        radiologiHistory = (LinearLayout) findViewById(R.id.radiologiHistory);
        radiologiHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiHistoryCekLab.this, IsiHistoryRadiologi.class);
                startActivity(intent);
            }
        });
    }
}

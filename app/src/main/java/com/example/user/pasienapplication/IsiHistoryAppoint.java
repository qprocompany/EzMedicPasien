package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class IsiHistoryAppoint extends AppCompatActivity {

    LinearLayout historylistpasien, beliobatHistory, appointHistory, radiologiHistory, ceklabHistory;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_history_appoint);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("History Appointment");

        beliobatHistory = (LinearLayout) findViewById(R.id.beliobatHistory);
        beliobatHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiHistoryAppoint.this, IsiHistoryObat.class);
                startActivity(intent);
            }
        });

        ceklabHistory = (LinearLayout) findViewById(R.id.ceklabHistory);
        ceklabHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiHistoryAppoint.this, IsiHistoryCekLab.class);
                startActivity(intent);
            }
        });

        radiologiHistory = (LinearLayout) findViewById(R.id.radiologiHistory);
        radiologiHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiHistoryAppoint.this, IsiHistoryRadiologi.class);
                startActivity(intent);
            }
        });
    }
}

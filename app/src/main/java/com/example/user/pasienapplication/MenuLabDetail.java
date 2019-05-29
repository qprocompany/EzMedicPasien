package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MenuLabDetail extends AppCompatActivity {

    Button requestlab;
    RadioGroup radioGroupHari, radioGroupJam;
    TextView detailprosedur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lab_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Laboratorium");

        radioGroupHari = (RadioGroup) findViewById(R.id.RadioHari);
        radioGroupJam = (RadioGroup) findViewById(R.id.RadioJam);

        requestlab = (Button) findViewById(R.id.requestlab);
        requestlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuLabDetail.this, PopOrder.class);
                startActivity(intent);
            }
        });

        detailprosedur = (TextView) findViewById(R.id.detailprosedur);
        detailprosedur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuLabDetail.this, PopDetailLab.class);
                startActivity(intent);
            }
        });
    }
}

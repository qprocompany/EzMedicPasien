package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class PopAlarmTambah extends AppCompatActivity {

    Button button;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_alarm_tambah);

        button = (Button) findViewById(R.id.btnTambahWaktu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(PopAlarmTambah.this, MenuMore.class);
                startActivity(intent);
            }
        });

        spinner = (Spinner) findViewById(R.id.spinKeluarga);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.SpinnerAlarm, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        DisplayMetrics dm =  new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8),(int) (height*.5));
    }
}

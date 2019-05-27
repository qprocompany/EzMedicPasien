package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class IsiUlangDompet extends AppCompatActivity {

    RadioGroup radioGroup;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_ulang_dompet);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Isi Ulang");

        radioGroup = (RadioGroup) findViewById(R.id.RadioNominal);

        button = (Button) findViewById(R.id.btnTambahNominal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiUlangDompet.this, MenuMore.class);
                startActivity(intent);
            }
        });
    }
}

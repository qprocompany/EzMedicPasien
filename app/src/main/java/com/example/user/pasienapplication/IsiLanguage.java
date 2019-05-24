package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class IsiLanguage extends AppCompatActivity {

    RadioGroup RadioLanguage;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_language);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Ubah Bahasa");

        RadioLanguage = (RadioGroup) findViewById(R.id.RadioLanguage);

        button = (Button) findViewById(R.id.btnUbahLanguage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsiLanguage.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}

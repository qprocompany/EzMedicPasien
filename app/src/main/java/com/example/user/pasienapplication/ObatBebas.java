package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ObatBebas extends AppCompatActivity {

    AutoCompleteTextView search_item;
    ArrayList<String> street = new ArrayList<>();
    LinearLayout sakitBatuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat_bebas);

        sakitBatuk = (LinearLayout) findViewById(R.id.sakitBatuk);
        sakitBatuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(ObatBebas.this, ObatBatuk.class);
                startActivity(intent);
            }
        });

        search_item = (AutoCompleteTextView) findViewById(R.id.search_item);

        street.add("Kelapa Gading");
        street.add("Sunter");
        street.add("Roxy");
        street.add("Thamrin");
        street.add("Gajah Mada");
        street.add("Harmoni");
        street.add("Kuningan");
        street.add("Pulo Gadung");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ObatBebas.this,android.R.layout.simple_spinner_dropdown_item,street);
        search_item.setAdapter(adapter);
    }
}

package com.example.user.pasienapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class InformasiObat extends AppCompatActivity {

    AutoCompleteTextView search_item;
    ArrayList<String> obat = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_obat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Informasi Obat");

        search_item = (AutoCompleteTextView) findViewById(R.id.search_item);

        obat.add("Amoxicillin");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(InformasiObat.this,android.R.layout.simple_spinner_dropdown_item,obat);
        search_item.setAdapter(adapter);
    }
}
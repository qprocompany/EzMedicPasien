package com.example.user.pasienapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class AddKeluarga extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    RadioGroup radioGroup;
    RadioButton radioButton;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_keluarga);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Add Keluarga Baru");

        radioGroup = (RadioGroup) findViewById(R.id.RadioGender);

        spinner = (Spinner) findViewById(R.id.spinKeluarga);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hubungan, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

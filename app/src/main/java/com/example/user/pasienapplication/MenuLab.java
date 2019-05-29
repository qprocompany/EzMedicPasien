package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuLab extends AppCompatActivity {

    AutoCompleteTextView search_item;
    ArrayList<String> street = new ArrayList<>();
    Button labdetail;
    LinearLayout detailprosedur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lab);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Lab Check");

        search_item = (AutoCompleteTextView)findViewById(R.id.search_item);

        street.add("Kelapa Gading");
        street.add("Sunter");
        street.add("Roxy");
        street.add("Thamrin");
        street.add("Gajah Mada");
        street.add("Harmoni");
        street.add("Kuningan");
        street.add("Pulo Gadung");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MenuLab.this,android.R.layout.simple_spinner_dropdown_item,street);
        search_item.setAdapter(adapter);

        labdetail = (Button) findViewById(R.id.labdetail);
        labdetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuLab.this, MenuLabDetail.class);
                startActivity(intent);
            }
        });

        detailprosedur = (LinearLayout) findViewById(R.id.detailprosedur);
        detailprosedur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuLab.this, PopDetailLab.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.history,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.historytittle:
                startActivity(new Intent(this, MenuHistory.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
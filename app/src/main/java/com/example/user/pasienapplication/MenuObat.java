package com.example.user.pasienapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MenuObat extends AppCompatActivity {

    AutoCompleteTextView search_item;
    ArrayList<String> street = new ArrayList<>();
    LinearLayout resep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_obat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Buy Medicine");

        resep = (LinearLayout) findViewById(R.id.resep);
        resep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuObat.this, ResepDokter.class);
                startActivity(intent);
            }
        });

        search_item = (AutoCompleteTextView)findViewById(R.id.search_item);

        street.add("Kelapa Gading");
        street.add("Sunter");
        street.add("Roxy");
        street.add("Thamrin");
        street.add("Gajah Mada");
        street.add("Harmoni");
        street.add("Kuningan");
        street.add("Pulo Gadung");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MenuObat.this,android.R.layout.simple_spinner_dropdown_item,street);
        search_item.setAdapter(adapter);
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

package com.example.user.pasienapplication;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;


public class MenuAppointment extends AppCompatActivity {

    TextView v;
    LinearLayout dokter1, ratingHistory;
    AutoCompleteTextView search_item;
    ArrayList<String> street = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_appointment);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Appointment");

        dokter1 = (LinearLayout) findViewById(R.id.dokter1);
        dokter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuAppointment.this, IsiDokter.class);
                startActivity(intent);
            }
        });

        ratingHistory = (LinearLayout) findViewById(R.id.ratingHistory);
        ratingHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuAppointment.this, RatingHistory.class);
                startActivity(intent);
            }
        });


        v = findViewById(R.id.textView14);
        v.setText("Rp.25.000");
        v.setPaintFlags(v.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        search_item = (AutoCompleteTextView)findViewById(R.id.search_item);

        street.add("Kelapa Gading");
        street.add("Sunter");
        street.add("Roxy");
        street.add("Thamrin");
        street.add("Gajah Mada");
        street.add("Harmoni");
        street.add("Kuningan");
        street.add("Pulo Gadung");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MenuAppointment.this,android.R.layout.simple_spinner_dropdown_item,street);

//        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MenuAppointment.this,android.R.layout.simple_spinner_dropdown_item,street);

        search_item.setAdapter(adapter);

//        items.setAdapter(adapter1);

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

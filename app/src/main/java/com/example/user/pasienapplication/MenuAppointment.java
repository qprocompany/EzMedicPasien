package com.example.user.pasienapplication;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuAppointment extends AppCompatActivity {

    TextView v;
    LinearLayout dokter1;
    Button btnRequest;
    String []titles;
    ArrayList<String>listtitles;
    EditText editText;
    ArrayAdapter<String>adapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_appointment);

        listView = (ListView)findViewById(R.id.list_item);
        editText = (EditText) findViewById(R.id.search_item);

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


        v = findViewById(R.id.textView14);
        v.setText("Rp.25.000");
        v.setPaintFlags(v.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        titlelistmethod();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().equals("")){
                    titlelistmethod();
                }
                else{
                    searchtitles(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

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

    public void titlelistmethod(){
        titles = new String[]{"Kelapa Gading", "Sunter", "Tanjung Duren", "Mangga Besar"};
        listtitles = new ArrayList<>(Arrays.asList(titles));
        adapter = new ArrayAdapter<String>(this,R.layout.row_layout,R.id.text,listtitles);
        listView.setAdapter(adapter);
    }

    public void searchtitles(String titlessearch){
        for(String i : titles){
            if(!i.contains(titlessearch)){
                listtitles.remove(i);
            }
        }
        adapter.notifyDataSetChanged();
    }

}

package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {

    LinearLayout appoin, obat , labcheck, labradio, history;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setTitle("Home");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent =  new Intent(MenuActivity.this, MenuActivity.class);
                        startActivity(intent);
//                      Toast.makeText(MenuActivity.this, "MenuActivity", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_profile:
                        Intent intent2 =  new Intent(MenuActivity.this, ProfilePasien.class);
                        startActivity(intent2);
//                      Toast.makeText(MenuActivity.this, "ProfilePasien", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_more:
                        Intent intent3 =  new Intent(MenuActivity.this, MenuMore.class);
                        startActivity(intent3);
//                      Toast.makeText(MenuActivity.this, "More", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        appoin = (LinearLayout) findViewById(R.id.appoin);
        appoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuActivity.this, MenuAppointment.class);
                startActivity(intent);
            }
        });

        obat = (LinearLayout) findViewById(R.id.obat);
        obat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuActivity.this, MenuObat.class);
                startActivity(intent);
            }
        });

        history = (LinearLayout) findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuActivity.this, MenuHistory.class);
                startActivity(intent);
            }
        });

        labcheck = (LinearLayout) findViewById(R.id.labcheck);
        labcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuActivity.this, MenuLab.class);
                startActivity(intent);
            }
        });

        labradio = (LinearLayout) findViewById(R.id.labradio);
        labradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuActivity.this, MenuRadiologi.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.notif_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.notifBtn:
            startActivity(new Intent(this, IsiNotif.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

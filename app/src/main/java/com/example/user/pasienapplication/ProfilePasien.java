package com.example.user.pasienapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class ProfilePasien extends AppCompatActivity {

    ImageView popNama, popEmail, popTelepon, popLahir, popNegara, popTinggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pasien);

        getSupportActionBar().setTitle("MY PROFILE");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent =  new Intent(ProfilePasien.this, MenuActivity.class);
                        startActivity(intent);
//                      Toast.makeText(MenuActivity.this, "MenuActivity", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_profile:
                        Intent intent2 =  new Intent(ProfilePasien.this, ProfilePasien.class);
                        startActivity(intent2);
//                      Toast.makeText(MenuActivity.this, "ProfilePasien", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_more:
                        Intent intent3 =  new Intent(ProfilePasien.this, MenuMore.class);
                        startActivity(intent3);
//                      Toast.makeText(MenuActivity.this, "More", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });


        popNama = (ImageView) findViewById(R.id.popNama);
        popTinggal = (ImageView) findViewById(R.id.popTinggal);
//        popTelepon = (ImageView) findViewById(R.id.popTelepon);
//        popEmail = (ImageView) findViewById(R.id.popEmail);
//        popNegara = (ImageView) findViewById(R.id.popNegara);
//        popLahir = (ImageView) findViewById(R.id.popLahir);

        popNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfilePasien.this, PopNama.class));
            }
        });

        popTinggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfilePasien.this, PopTinggal.class));
            }
        });
//
//        popTelepon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(ProfilePasien.this, PopTelepon.class));
//            }
//        });
//
//        popEmail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(ProfilePasien.this, PopEmail.class));
//            }
//        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_more,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case  R.id.addMore:
            startActivity(new Intent(this, AddKeluarga.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

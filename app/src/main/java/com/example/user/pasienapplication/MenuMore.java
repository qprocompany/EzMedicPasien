package com.example.user.pasienapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MenuMore extends AppCompatActivity {

    LinearLayout IsiFaq, IsiHelp, IsiTerm, IsiPrivacy, IsiUlangUang, IsiLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_more);

        getSupportActionBar().setTitle("More");



        IsiFaq = (LinearLayout) findViewById(R.id.IsiFaq);
        IsiFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuMore.this, IsiFaq.class);
                startActivity(intent);
            }
        });

        IsiHelp = (LinearLayout) findViewById(R.id.IsiHelp);
        IsiHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuMore.this, IsiHelp.class);
                startActivity(intent);
            }
        });

        IsiTerm = (LinearLayout) findViewById(R.id.IsiTerm);
        IsiTerm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuMore.this, IsiTermOfService.class);
                startActivity(intent);
            }
        });

        IsiPrivacy = (LinearLayout) findViewById(R.id.IsiPrivacy);
        IsiPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuMore.this, IsiPrivacy.class);
                startActivity(intent);
            }
        });

        IsiLanguage = (LinearLayout) findViewById(R.id.IsiLanguage);
        IsiLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MenuMore.this, IsiLanguage.class);
                startActivity(intent);
            }
        });


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent =  new Intent(MenuMore.this, MenuActivity.class);
                        startActivity(intent);
//                      Toast.makeText(MenuActivity.this, "MenuActivity", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_profile:
                        Intent intent2 =  new Intent(MenuMore.this, ProfilePasien.class);
                        startActivity(intent2);
//                      Toast.makeText(MenuActivity.this, "ProfilePasien", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_more:
                        Intent intent3 =  new Intent(MenuMore.this, MenuMore.class);
                        startActivity(intent3);
//                      Toast.makeText(MenuActivity.this, "More", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}

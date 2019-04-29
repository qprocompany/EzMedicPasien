package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class FormRatingDokter extends AppCompatActivity {

    RatingBar rb;
    TextView value;
    Button btnSendRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_rating_dokter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Rating");

        rb = (RatingBar) findViewById(R.id.ratingBar);
        value = (TextView) findViewById(R.id.value);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                value.setText("Value : " + rating);
            }
        });

        btnSendRating = (Button) findViewById(R.id.btnSendRating);
        btnSendRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(FormRatingDokter.this, MenuActivity.class);
                startActivity(intent);
            }
        });

    }
}

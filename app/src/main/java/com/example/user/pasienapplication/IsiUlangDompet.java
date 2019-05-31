package com.example.user.pasienapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class IsiUlangDompet extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView saldoKosong;
    Button button;
    RadioButton radioButton, radioNom1,radioNom2,radioNom3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_ulang_dompet);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Isi Ulang");



        radioGroup = (RadioGroup) findViewById(R.id.RadioNominal);
        button = (Button) findViewById(R.id.btnTambahNominal);
        radioNom1 = (RadioButton) findViewById(R.id.RadioNom1);
        radioNom2 = (RadioButton) findViewById(R.id.RadioNom2);
        radioNom3 = (RadioButton) findViewById(R.id.RadioNom3);
        saldoKosong = (TextView) findViewById(R.id.saldokosong);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiUlangDompet.this, MenuMore.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);

                Toast.makeText(IsiUlangDompet.this,
                        radioButton.getText(), Toast.LENGTH_SHORT).show();

                Integer nominal = 0;
                Integer mnominaltemp = 0;

                if(radioNom1.isChecked())
                    mnominaltemp = nominal + 50000;
                else if(radioNom2.isChecked())
                    mnominaltemp = nominal + 100000;
                else if(radioNom3.isChecked())
                    mnominaltemp = nominal + 200000;

                String nominaltotal = String.valueOf(mnominaltemp);



                saldoKosong.setText("Rp."+nominaltotal);
            }
        });
    }
}

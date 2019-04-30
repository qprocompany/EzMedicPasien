package com.example.user.pasienapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FotoResep extends AppCompatActivity {

    public static final int CAMERA_REQUEST=9999;
    ImageView hasil;
    Button setuju;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_resep);

        hasil = findViewById(R.id.hasil);

        setuju = (Button) findViewById(R.id.setuju);
        setuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(FotoResep.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }

    public void OpenCamera(View view){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAMERA_REQUEST){
            Bitmap bitmap = (Bitmap)data.getExtras().get("data");
            hasil.setImageBitmap(bitmap);
        }
    }
}
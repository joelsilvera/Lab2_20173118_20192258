package com.example.lab2_20173118_20192258;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageButton button = findViewById(R.id.imageButton8);
        button.setOnClickListener( view -> {
            Toast.makeText(HomePage.this,"Hola Mundo", Toast.LENGTH_SHORT).show(); //Mensajito rápido en la parte inferior
        });
    }
}
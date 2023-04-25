package com.example.lab2_20173118_20192258;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;



public class ejercicio3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.parseColor("#8ED64F"));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ejercicio3.this,ejercicio4.class);
                startActivity(intent);
            }
        });
    }
}
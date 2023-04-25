package com.example.lab2_20173118_20192258;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;


public class ejercicio4 extends AppCompatActivity {

    CheckBox c30, c26, c23;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        c30 = (CheckBox) findViewById(R.id.checkBox30);
        c26 = (CheckBox) findViewById(R.id.checkBox26);
        c23 = (CheckBox) findViewById(R.id.checkBox23);

        findViewById(R.id.button23).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogoBasico();
            }
        });

        ImageButton button3 = findViewById(R.id.imageButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ejercicio4.this,ejercicio3.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void mostrarDialogoBasico(){
        AlertDialog.Builder builder = new AlertDialog.Builder(ejercicio4.this);

        String mensajito = null;

        if(c30.isChecked() && ((c26.isChecked()==false)&&(c23.isChecked()==false))){
            mensajito = "Su compra de 1 ticket con un valor total de S/30.00 fue realizado con éxito.";
        }
        if(c26.isChecked() && ((c30.isChecked()==false)&&(c23.isChecked()==false))){
            mensajito = "Su compra de 1 ticket con un valor total de S/26.00 fue realizado con éxito.";
        }
        if(c23.isChecked() && ((c30.isChecked()==false)&&(c26.isChecked()==false))){
            mensajito = "Su compra de 1 ticket con un valor total de S/23.00 fue realizado con éxito.";
        }
        if(c30.isChecked() && c26.isChecked() && (c23.isChecked()==false)){
            mensajito = "Su compra de 2 tickets con un valor total de S/56.00 fue realizado con éxito.";
        }
        if(c26.isChecked() && c23.isChecked() && (c30.isChecked()==false)){
            mensajito = "Su compra de 2 tickets con un valor total de S/49.00 fue realizado con éxito.";
        }
        if(c30.isChecked() && c23.isChecked() && (c26.isChecked()==false)){
            mensajito = "Su compra de 2 tickets con un valor total de S/53.00 fue realizado con éxito.";
        }
        if(c30.isChecked() && c26.isChecked() && c23.isChecked()){
            mensajito = "Su compra de 3 tickets con un valor total de S/79.00 fue realizado con éxito.";
        }
        if((c30.isChecked()==false) && (c26.isChecked()==false) && (c23.isChecked()==false)){
            mensajito = "Los tickets están disponibles, pero debes seleccionar cuáles comprarás";
        }


        builder.setTitle("Felicidades!!!");
        builder.setMessage(mensajito)
                .setPositiveButton("ENTIENDO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Cargando tickets telecos",Toast.LENGTH_SHORT).show();
                    }
                })

                .setCancelable(false)
                .show();
    }

}
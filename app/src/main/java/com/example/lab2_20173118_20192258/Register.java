package com.example.lab2_20173118_20192258;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class Register extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        CheckBox myCheckBox1 = findViewById(R.id.checkBox2);
        CheckBox myCheckBox2 = findViewById(R.id.checkBox3);
        EditText id1 = findViewById(R.id.id1);
        EditText id2 = findViewById(R.id.id2);
        EditText id3 = findViewById(R.id.id3);
        EditText id4 = findViewById(R.id.id4);
        Button myButton = findViewById(R.id.button);


        myButton.setEnabled(false);

        myCheckBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (myCheckBox1.isChecked() && myCheckBox2.isChecked() && !id1.getText().toString().isEmpty() && !id2.getText().toString().isEmpty() && !id3.getText().toString().isEmpty() && !id4.getText().toString().isEmpty()) {
                    myButton.setEnabled(true);
                } else {
                    myButton.setEnabled(false);
                }
            }
        });

        myCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (myCheckBox1.isChecked() && myCheckBox2.isChecked() && !id1.getText().toString().isEmpty() && !id2.getText().toString().isEmpty() && !id3.getText().toString().isEmpty() && !id4.getText().toString().isEmpty()) {
                    myButton.setEnabled(true);
                } else {
                    myButton.setEnabled(false);
                }
            }
        });

        id1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (myCheckBox1.isChecked() && myCheckBox2.isChecked() && !id1.getText().toString().isEmpty() && !id2.getText().toString().isEmpty() && !id3.getText().toString().isEmpty() && !id4.getText().toString().isEmpty()) {
                    myButton.setEnabled(true);
                } else {
                    myButton.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        id2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (myCheckBox1.isChecked() && myCheckBox2.isChecked() && !id1.getText().toString().isEmpty() && !id2.getText().toString().isEmpty() && !id3.getText().toString().isEmpty() && !id4.getText().toString().isEmpty()) {
                    myButton.setEnabled(true);
                } else {
                    myButton.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        id3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (myCheckBox1.isChecked() && myCheckBox2.isChecked() && !id1.getText().toString().isEmpty() && !id2.getText().toString().isEmpty() && !id3.getText().toString().isEmpty() && !id4.getText().toString().isEmpty()) {
                    myButton.setEnabled(true);
                } else {
                    myButton.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        id4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (myCheckBox1.isChecked() && myCheckBox2.isChecked() && !id1.getText().toString().isEmpty() && !id2.getText().toString().isEmpty() && !id3.getText().toString().isEmpty() && !id4.getText().toString().isEmpty()) {
                    myButton.setEnabled(true);
                } else {
                    myButton.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        //Para cuando fusionemos las ramas:
        //myButton.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Intent intent = new Intent(Register.this,HomePage.class);
        //        startActivity(intent);
        //    }
        //});

        Button myButton2 = findViewById(R.id.button2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this,LogReg.class);
                startActivity(intent);
            }
        });

    }
}
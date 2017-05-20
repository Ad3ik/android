package com.example.adrian.dzienniktreningowy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DodajAktywnosc extends AppCompatActivity {


    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj_aktywnosc);


        spinner= (Spinner) findViewById(R.id.spinner_this1);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.choice_activity_array, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
    }
}

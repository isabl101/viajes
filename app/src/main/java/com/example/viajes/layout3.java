package com.example.viajes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class layout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);

        getSupportActionBar().hide();
    }

    /*public void irACuartaPag (View view){
        Intent i = new Intent(this, layout4.class);
        startActivity(i);
    }*/
}
package com.example.viajes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class layout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        getSupportActionBar().hide();
    }
    public void irATerceraPag (View view){
        Intent i = new Intent(this, layout3.class);
        startActivity(i);
    }
}
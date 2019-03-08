package com.example.paletteactivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;

public class PaletteActivity extends AppCompatActivity {
    ConstraintLayout canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        Intent intent = getIntent();
        String color = intent.getStringExtra("color");

        canvas = findViewById(R.id.layoutback);
        canvas.setBackgroundColor(Color.parseColor(color));
    }
}

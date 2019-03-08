package com.example.paletteactivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = findViewById(R.id.color_spinner);

        final String[] viewcolors = {"yellow","green","red","white","blue","gray","darkGray","lightGray","magenta","cyan"};



        myAdapter colorAdapter = new myAdapter(this,R.layout.spinner_layout,viewcolors );

        spinner.setAdapter(colorAdapter);

        final Intent myIntent = new Intent(this  , PaletteActivity.class);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView color = view.findViewById(R.id.color_name);


                myIntent.putExtra("color", color.getText().toString());
                startActivity(myIntent);

               /* ConstraintLayout base = findViewById(R.id.base_color);
                base.setBackgroundColor(Color.WHITE);*/

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }
}

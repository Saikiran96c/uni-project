package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Homesafety extends AppCompatActivity {
    private CardView c1;
    private CardView c2;
    private CardView c3;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homesafety);

        image = findViewById(R.id.homebtn);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });
        c1 = (CardView) findViewById(R.id.fire);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), fireandemergency.class);
                startActivity(intent);
            }
        });
        c2 = (CardView) findViewById(R.id.earthquake);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Earthquake.class);
                startActivity(intent);
            }
        });
        c3 = (CardView) findViewById(R.id.Heating);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Heating.class);
                startActivity(intent);
            }
        });
    }
}

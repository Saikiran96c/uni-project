package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Chineselunch extends AppCompatActivity {
    private CardView kung;
    private CardView chow;
    private CardView shrimp;
    private ImageView logoo;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chineselunch);
        logoo = findViewById(R.id.imageView18);
        logoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

        kung = (CardView) findViewById(R.id.kung);
        kung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), kung.class);
                startActivity(intent);
            }
        });
        chow = (CardView) findViewById(R.id.chow);
        chow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), chow.class);
                startActivity(intent);
            }
        });
        shrimp = (CardView) findViewById(R.id.shrimp);
        shrimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), shrimp.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.Menu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), cooking.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Indiandinner extends AppCompatActivity {
    private CardView chap;
    private CardView butter;
    private CardView naan;
    private ImageView log;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indiandinner);
        log = findViewById(R.id.imageView18);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

        chap = (CardView) findViewById(R.id.chapthi);
        chap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), chapathi.class);
                startActivity(intent);
            }
        });
        butter = (CardView) findViewById(R.id.butter);
        butter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), butter.class);
                startActivity(intent);
            }
        });
        naan = (CardView) findViewById(R.id.naan);
        naan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), naan.class);
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

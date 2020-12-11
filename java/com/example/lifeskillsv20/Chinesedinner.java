package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Chinesedinner extends AppCompatActivity {
    private CardView beef;
    private CardView sweet;
    private CardView mush;
    private ImageView logg;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinesedinner);
        logg = findViewById(R.id.imageView18);
        logg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

        beef = (CardView) findViewById(R.id.beef);
        beef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), beef.class);
                startActivity(intent);
            }
        });
        sweet = (CardView) findViewById(R.id.sweet);
        sweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), sweet.class);
                startActivity(intent);
            }
        });
        mush = (CardView) findViewById(R.id.mushroom);
        mush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), mush.class);
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

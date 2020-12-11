package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class LunchRecipie extends AppCompatActivity {
    private Button button;
    private ImageView V;
    private Button Botton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_recipie);
        V = findViewById(R.id.imageView18);
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Indianlunchbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                Intent intent = new Intent(getBaseContext(), IndianLunch.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Chineselunchbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                Intent intent = new Intent(getBaseContext(), Chineselunch.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Kiwilunchbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                Intent intent = new Intent(getBaseContext(), Kiwilunch.class);
                startActivity(intent);
            }
        });
        Botton = findViewById(R.id.Menu);
        Botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), cooking.class);
                startActivity(intent);
            }
        });
    }
}

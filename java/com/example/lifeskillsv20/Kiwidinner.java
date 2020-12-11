package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Kiwidinner extends AppCompatActivity {
    private CardView pot;
    private CardView ging;
    private CardView bran;
    private ImageView lug;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiwidinner);
        lug = findViewById(R.id.imageView18);
        lug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

        pot = (CardView) findViewById(R.id.potato);
        pot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),potato.class);
                startActivity(intent);
            }
        });
        ging = (CardView) findViewById(R.id.ginger);
        ging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ginger.class);
                startActivity(intent);
            }
        });
        bran = (CardView) findViewById(R.id.brandy);
        bran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), brandy.class);
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

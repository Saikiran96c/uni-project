package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Indianlist extends AppCompatActivity {
    private CardView s1;
    private CardView d1;
    private CardView u;
    private ImageView v;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indianlist);
        v = findViewById(R.id.imageView18);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

        s1 = (CardView) findViewById(R.id.idly);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), IndianRecipie.class);
                startActivity(intent);
            }
        });
        d1 = (CardView) findViewById(R.id.Dosa);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Dosa.class);
                startActivity(intent);
            }
        });
        u = (CardView) findViewById(R.id.Upma);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Upma.class);
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

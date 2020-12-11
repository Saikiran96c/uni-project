package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class cooking<button> extends AppCompatActivity {

    private Button button;
    private ImageView h1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);
        h1 = findViewById(R.id.imageView18);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Breakfastbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                Intent intent = new Intent(getBaseContext(), BreakfastRecipe.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Lunchbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), LunchRecipie.class);
                startActivity(intent);
            }
            });
        button = (Button) findViewById(R.id.Dinnerbtn);
        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getBaseContext(), DinnerRecipie.class);
                    startActivity(intent);
                }
                });


    }
}

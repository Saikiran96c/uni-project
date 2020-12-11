package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    private ImageButton B2;
    private ImageView d1;
    private ImageView h1;
    private ImageView h2;
    private ImageView w1;
    private ImageView t1;
    private ImageView c1;
    private ImageView add1;
    private ImageView custom1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        t1 = (ImageView) findViewById(R.id.imageviewt1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Transport.class);
                startActivity(intent);

            }
        });

        d1 = (ImageView) findViewById(R.id.imageviewd1);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), drivingtips.class);
                startActivity(intent);

            }
        });

        c1 = (ImageView) findViewById(R.id.imageviewc1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), cooking.class);
                startActivity(intent);

            }
        });
        h2 = (ImageView) findViewById(R.id.imageviewh2);
        h2.setImageResource(R.drawable.homesafety);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Homesafety.class);
                startActivity(intent);

            }
        });
        w1 = (ImageView) findViewById(R.id.imagevieww1);
        w1.setImageResource(R.drawable.workouts);
        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), workouts.class);
                startActivity(intent);


            }
        });
        h1 = (ImageView) findViewById(R.id.imageviewh1);
        h1.setImageResource(R.drawable.health);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Health.class);
                startActivity(intent);
            }
        });

        custom1 = (ImageView) findViewById(R.id.imageviewcustom);
        custom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), CustomSkills.class);
                startActivity(intent);
            }
        });
    }
}


package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Triceps_dips extends AppCompatActivity {
    ImageView triceps;
    Button trid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_dips);

        trid = findViewById(R.id.tricepsbackbutton);
        trid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), workouts.class);
                startActivity(intent);
            }
        });

        triceps = (ImageView) findViewById(R.id.tricepshomeicon);
        triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

        TextView text = (TextView) findViewById(R.id.linktriceps);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

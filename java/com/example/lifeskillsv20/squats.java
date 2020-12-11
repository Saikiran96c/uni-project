package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class squats extends AppCompatActivity {
    Button sq;
    ImageView squats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squats);
        sq = findViewById(R.id.squatsbackbutton);
        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), workouts.class);
                startActivity(intent);
            }
        });

        squats = (ImageView) findViewById(R.id.sqautshomeicon);
        squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

        TextView text = (TextView) findViewById(R.id.linksquats);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

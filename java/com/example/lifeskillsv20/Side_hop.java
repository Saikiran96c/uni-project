package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Side_hop extends AppCompatActivity {
    Button side;
    ImageView sideimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_hop);

        side = findViewById(R.id.sidebackbutton);
        side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), workouts.class);
                startActivity(intent);
            }
        });

        sideimage = (ImageView) findViewById(R.id.sidehomeicon);
        sideimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });
        TextView text = (TextView) findViewById(R.id.linkside);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

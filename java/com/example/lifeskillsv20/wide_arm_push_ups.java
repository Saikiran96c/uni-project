package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class wide_arm_push_ups extends AppCompatActivity {
    Button wp2;
    ImageView imagewp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wide_arm_push_ups);
        wp2 = findViewById(R.id.wpbackbutton);
        wp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), workouts.class);
                startActivity(intent);
            }
        });

        imagewp = (ImageView) findViewById(R.id.wphomeicon);
        imagewp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });


        TextView text = (TextView) findViewById(R.id.linkwpushups);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

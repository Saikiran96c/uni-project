package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Leg_workout extends AppCompatActivity {
    CardView squat;
    CardView side;
    CardView blun;
    Animation bottomAnim;
    ImageView imageleg1;
    ImageView imageleg2;
    ImageView imageleg3;
    ImageView legs;
    TextView legt1;
    TextView legt2;
    TextView legt3;
    Button leg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_workout);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        imageleg1 = findViewById(R.id.Legsimage2);
        imageleg1.setAnimation(bottomAnim);
        imageleg2 = findViewById(R.id.legsimage3);
        imageleg2.setAnimation(bottomAnim);
        imageleg3 = findViewById(R.id.Legsimage4);
        imageleg3.setAnimation(bottomAnim);
        legt1 = findViewById(R.id.legtext1);
        legt1.setAnimation(bottomAnim);
        legt2 = findViewById(R.id.legtext2);
        legt2.setAnimation(bottomAnim);
        legt3 = findViewById(R.id.legtext3);
        legt3.setAnimation(bottomAnim);
        squat = findViewById(R.id.Squats);
        squat.setAnimation(bottomAnim);
        side = findViewById(R.id.Side_hop);
        side.setAnimation(bottomAnim);
        blun = findViewById(R.id.blunge);
        blun.setAnimation(bottomAnim);

        squat = (CardView) findViewById(R.id.Squats);
        squat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), squats.class);
                startActivity(intent);
            }
        });
        side= (CardView) findViewById(R.id.Side_hop);
        side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Side_hop.class);
                startActivity(intent);
            }
        });

        blun = (CardView) findViewById(R.id.blunge);
        blun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Blunge.class);
                startActivity(intent);
            }
        });
        leg = findViewById(R.id.back_button);
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), workouts.class);
                startActivity(intent);
            }
        });

        legs = (ImageView) findViewById(R.id.leghomeicon);
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

    }
}

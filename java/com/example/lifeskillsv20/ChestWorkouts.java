package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChestWorkouts extends AppCompatActivity {
    CardView b1;
    CardView j1;
    CardView p1;
    Button wp1;
    Animation bottomAnim;
    ImageView imagech1;
    ImageView imagech2;
    ImageView imagech3;
    ImageView imagechest;
    TextView ct1;
    TextView ct2;
    TextView ct3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workouts);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        imagech1 = findViewById(R.id.chestimage2);
        imagech1.setAnimation(bottomAnim);
        imagech2 = findViewById(R.id.chestimage3);
        imagech2.setAnimation(bottomAnim);
        imagech3 = findViewById(R.id.chestimage4);
        imagech3.setAnimation(bottomAnim);
        ct1 = findViewById(R.id.chesttext2);
        ct1.setAnimation(bottomAnim);
        ct2 = findViewById(R.id.chesttext3);
        ct2.setAnimation(bottomAnim);
        ct3 = findViewById(R.id.chesttext4);
        ct3.setAnimation(bottomAnim);
        b1 = findViewById(R.id.Jumpingjacks1);
        b1.setAnimation(bottomAnim);
        j1 = findViewById(R.id.pushups2);
        j1.setAnimation(bottomAnim);
        p1 = findViewById(R.id.wide_arm_pushups3);
        p1.setAnimation(bottomAnim);

        b1 = (CardView) findViewById(R.id.Jumpingjacks1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Jumping_Jacks.class);
                startActivity(intent);
            }
        });

        j1 = (CardView) findViewById(R.id.pushups2);
        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), push_ups.class);
                startActivity(intent);
            }
        });
        p1 = (CardView) findViewById(R.id.wide_arm_pushups3);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), wide_arm_push_ups.class);
                startActivity(intent);
            }
        });
        wp1 = findViewById(R.id.back_button);
        wp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), workouts.class);
                startActivity(intent);
            }
        });

        imagechest = (ImageView) findViewById(R.id.chesthomeicon);
        imagechest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });
    }
    }


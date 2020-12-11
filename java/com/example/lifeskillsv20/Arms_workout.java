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

public class Arms_workout extends AppCompatActivity {
    private CardView armraise;
    private CardView triceps;
    private CardView diamondp;
    Animation bottomAnim;
    ImageView imagear1;
    ImageView imagear2;
    ImageView imagear3;
    TextView art1;
    TextView art2;
    TextView art3;
    Button arms;
    ImageView arm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms_workout);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        imagear1 = findViewById(R.id.Armsimage2);
        imagear1.setAnimation(bottomAnim);
        imagear2 = findViewById(R.id.Armsimage3);
        imagear2.setAnimation(bottomAnim);
        imagear3 = findViewById(R.id.Armsimage4);
        imagear3.setAnimation(bottomAnim);
        art1 = findViewById(R.id.armstext2);
        art1.setAnimation(bottomAnim);
        art2 = findViewById(R.id.armstext3);
        art2.setAnimation(bottomAnim);
        art3 = findViewById(R.id.armstext4);
        art3.setAnimation(bottomAnim);
        armraise = findViewById(R.id.Arm_raises);
        armraise.setAnimation(bottomAnim);
        triceps = findViewById(R.id.Triceps_dips);
        triceps.setAnimation(bottomAnim);
        diamondp = findViewById(R.id.Diamond_pushups);
        diamondp.setAnimation(bottomAnim);

        armraise = (CardView) findViewById(R.id.Arm_raises);
        armraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Arm_raises.class);
                startActivity(intent);
            }
        });
        triceps = (CardView) findViewById(R.id.Triceps_dips);
        triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Triceps_dips.class);
                startActivity(intent);
            }
        });

        diamondp = (CardView) findViewById(R.id.Diamond_pushups);
        diamondp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Diamond.class);
                startActivity(intent);
            }
        });

        arms = findViewById(R.id.back_button);
        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), workouts.class);
                startActivity(intent);
            }
        });

        arm = (ImageView) findViewById(R.id.armshomeicon);
        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });
    }
}

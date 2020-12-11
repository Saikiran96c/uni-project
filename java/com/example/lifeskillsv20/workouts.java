package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class workouts extends AppCompatActivity {
    private Button c1;
    private Button a1;
    private Button bs1;
    private Button L1;
    Animation topAnim;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;
    ImageView workouthome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        image1 = findViewById(R.id.imageWorkout1);
        image1.setAnimation(topAnim);
        image2 = findViewById(R.id.imageWorkout2);
        image2.setAnimation(topAnim);
        image4 = findViewById(R.id.imageWorkout4);
        image4.setAnimation(topAnim);
        image5 = findViewById(R.id.imageWorkout5);
        image5.setAnimation(topAnim);

        c1 = (Button) findViewById(R.id.Chest);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ChestWorkouts.class);
                startActivity(intent);
    }
});
        a1 = (Button) findViewById(R.id.Arms);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Arms_workout.class);
                startActivity(intent);
            }
        });

        L1 = (Button) findViewById(R.id.Legs);
        L1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Leg_workout.class);
                startActivity(intent);
            }
        });
        workouthome = (ImageView) findViewById(R.id.imageViewlogowork1);
        workouthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });
    }
}
    
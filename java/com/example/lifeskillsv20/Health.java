package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Health extends AppCompatActivity {
    private Button burn;
    private Button nz;
    private Button br;
    Animation topAnim;
    ImageView image6;
    ImageView image7;
    ImageView image8;
    ImageView image9;
    ImageView health;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        image6 = findViewById(R.id.health_image1);
        image6.setAnimation(topAnim);
        image7 = findViewById(R.id.health_image2);
        image7.setAnimation(topAnim);
        image8 = findViewById(R.id.health_image3);
        image8.setAnimation(topAnim);
        image9 = findViewById(R.id.health_image4);
        image9.setAnimation(topAnim);
        burn = (Button) findViewById(R.id.health_button2);
        burn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), First_Aid.class);
                startActivity(intent);
            }
        });
        nz = (Button) findViewById(R.id.health_button1);
        nz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), NZ_health.class);
                startActivity(intent);
            }
        });
        br = (Button) findViewById(R.id.health_button3);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Basic_relief.class);
                startActivity(intent);
            }
        });

        health = (ImageView) findViewById(R.id.health_home_icon);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

    }
}

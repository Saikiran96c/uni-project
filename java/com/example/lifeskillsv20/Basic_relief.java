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

public class Basic_relief extends AppCompatActivity {
    Animation bottomAnim;
    ImageView image13;
    ImageView image14;
    ImageView image15;
    Button b1;
    Button b2;
    Button b3;
    TextView t1;
    TextView t2;
    TextView t3;
    CardView card1;
    CardView card2;
    CardView card3;
    Button b4;
    ImageView imagebr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_relief);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        image13 = findViewById(R.id.imageview_cold);
        image13.setAnimation(bottomAnim);
        image14 = findViewById(R.id.imageview_headache);
        image14.setAnimation(bottomAnim);
        image15 = findViewById(R.id.imageview_stomachache);
        image15.setAnimation(bottomAnim);
        t1 = findViewById(R.id.text_cold);
        t1.setAnimation(bottomAnim);
        t2 = findViewById(R.id.text_headache);
        t2.setAnimation(bottomAnim);
        t3 = findViewById(R.id.text_stomachache);
        t3.setAnimation(bottomAnim);
        card1 = findViewById(R.id.cold);
        card1.setAnimation(bottomAnim);
        card2 = findViewById(R.id.headache);
        card2.setAnimation(bottomAnim);
        card3 = findViewById(R.id.stomachache);
        card3.setAnimation(bottomAnim);


        card1 = (CardView) findViewById(R.id.cold);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Cold.class);
                startActivity(intent);
            }
        });


        card2 = (CardView) findViewById(R.id.headache);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), headache.class);
                startActivity(intent);
            }
        });

        card3 = (CardView) findViewById(R.id.stomachache);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), stomachache.class);
                startActivity(intent);
            }
        });


        b4 = (Button) findViewById(R.id.basic_relief_back_button);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Health.class);
                startActivity(intent);
            }
        });

        imagebr = (ImageView) findViewById(R.id.basicreliefhomeicon);
        imagebr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

    }
}

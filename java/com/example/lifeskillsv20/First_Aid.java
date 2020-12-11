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

public class First_Aid extends AppCompatActivity {
    private CardView burn;
    private Button nz;
    private Button br;
    private CardView ch;
    Animation bottomAnim;
    ImageView image10;
    ImageView image11;
    ImageView image12;
    ImageView image13;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__aid);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        image10 = findViewById(R.id.imageviewd1);
        image10.setAnimation(bottomAnim);
        image11 = findViewById(R.id.imageviewd2);
        image11.setAnimation(bottomAnim);
        image12 = findViewById(R.id.imageviewd3);
        image12.setAnimation(bottomAnim);
        t1 = findViewById(R.id.text1);
        t1.setAnimation(bottomAnim);
        t2 = findViewById(R.id.text2);
        t2.setAnimation(bottomAnim);
        t3 = findViewById(R.id.text3);
        t3.setAnimation(bottomAnim);
        card1 = findViewById(R.id.burns);
        card1.setAnimation(bottomAnim);
        card2 = findViewById(R.id.cuts);
        card2.setAnimation(bottomAnim);
        card3 = findViewById(R.id.chockingcard);
        card3.setAnimation(bottomAnim);

        ch = (CardView) findViewById(R.id.chockingcard);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), chocking.class);
                startActivity(intent);
            }
        });


        burn = (CardView) findViewById(R.id.burns);
        burn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Burns.class);
                startActivity(intent);
            }
        });

        card2 = (CardView) findViewById(R.id.cuts);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), cuts.class);
                startActivity(intent);
            }
        });


        b4 = (Button) findViewById(R.id.firstaid_back);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Health.class);
                startActivity(intent);
            }
        });

        image13 = (ImageView) findViewById(R.id.firstaidhomeicon);
        image13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });



    }
}

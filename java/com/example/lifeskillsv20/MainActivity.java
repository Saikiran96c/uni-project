package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    Animation topAnim;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        image = findViewById(R.id.imageView);
        image.setAnimation(topAnim);

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(5000);

                    Intent intent = new Intent(getBaseContext(), Home.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        myThread.start();



    }
}


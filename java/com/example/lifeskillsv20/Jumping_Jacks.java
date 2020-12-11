package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Jumping_Jacks extends AppCompatActivity {
    private Button jbackbutton;
    ImageView imagej;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumping__jacks);

        jbackbutton = (Button) findViewById(R.id.jbackbutton);
        jbackbutton.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(getBaseContext(), workouts.class);
                                      startActivity(intent);
                                  }
                              });


        imagej = (ImageView) findViewById(R.id.jumpingjhomeicon);
        imagej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });


        TextView text = (TextView) findViewById(R.id.linkjumpingj);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

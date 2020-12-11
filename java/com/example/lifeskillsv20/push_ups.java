package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class push_ups extends AppCompatActivity {
    private Button pbackbutton;
    ImageView pushup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_ups);

        pushup = (ImageView) findViewById(R.id.pushupshomeicon);
        pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

        pbackbutton = (Button) findViewById(R.id.pbackbutton);
        pbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), workouts.class);
                startActivity(intent);
            }
        });

        TextView text = (TextView) findViewById(R.id.linkpushups);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class chocking extends AppCompatActivity {
    private Button chb;
    ImageView imagechok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocking);

        TextView text = (TextView) findViewById(R.id.linkchocking);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        chb = (Button) findViewById(R.id.chocking_back);
        chb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Health.class);
                startActivity(intent);
            }
        });

        imagechok = (ImageView) findViewById(R.id.chockinghomeicon);
        imagechok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

    }
}

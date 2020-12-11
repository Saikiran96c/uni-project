package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NZ_health extends AppCompatActivity {
    private Button nzb1;
    ImageView imagenz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_z_health);


        TextView text = (TextView) findViewById(R.id.linknz);
        text.setMovementMethod(LinkMovementMethod.getInstance());
        nzb1 = (Button) findViewById(R.id.nz_back);
        nzb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Health.class);
                startActivity(intent);
            }
        });

        imagenz = (ImageView) findViewById(R.id.nzhomeicon);
        imagenz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

    }
}

package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class cuts extends AppCompatActivity {
    private Button cb;
    ImageView imagecut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuts);

        TextView text = (TextView) findViewById(R.id.linkcuts);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        cb = (Button) findViewById(R.id.cuts_back);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Health.class);
                startActivity(intent);
            }
        });
        imagecut = (ImageView) findViewById(R.id.cutshomeicon);
        imagecut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

    }
}

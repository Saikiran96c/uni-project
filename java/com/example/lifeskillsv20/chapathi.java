package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class chapathi extends AppCompatActivity {
    private ImageView chap1;
    private Button chap2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapathi);
        chap1 = findViewById(R.id.imageView18);
        chap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });
        chap2 = findViewById(R.id.Menu);
        chap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),cooking.class);
                startActivity(intent);
            }
        });
        TextView text = (TextView) findViewById(R.id.link);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

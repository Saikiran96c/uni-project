package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class eggfriedrice extends AppCompatActivity {
    private ImageView egg1;
    private Button egg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eggfriedrice);
        egg1 = findViewById(R.id.imageView18);
        egg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });
        egg2 = findViewById(R.id.Menu);
        egg2.setOnClickListener(new View.OnClickListener() {
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

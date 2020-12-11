package com.example.lifeskillsv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateSkill extends AppCompatActivity {

    private EditText titleEditText;
    private EditText paragraphEditText;
    int fileNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_skill);

        try{
            String skillNumber = getIntent().getExtras().getString(Intent.EXTRA_TEXT);
            fileNumber = Integer.parseInt(skillNumber);
        }catch (NullPointerException e){
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
            showCustomSkills();
        }
        titleEditText = findViewById(R.id.editText);
        paragraphEditText = findViewById(R.id.editParagraph);
    }

    public void showCustomSkills(){
        Intent intent = new Intent(getBaseContext(), CustomSkills.class);
        startActivity(intent);
    }

    public void back(View view){
        Intent intent = new Intent(getBaseContext(), CustomSkills.class);
        startActivity(intent);
    }

    public void save(View view){

        if(titleEditText.getText().toString().contains("@") || paragraphEditText.getText().toString().contains("@")){
            Toast.makeText(this, "@ character is not allowed in the title or paragraph", Toast.LENGTH_LONG).show();
        }
        else if(titleEditText.getText().toString().equals("")){
            Toast.makeText(this, "Please enter a title", Toast.LENGTH_LONG).show();
        }
        else{
            String text = titleEditText.getText().toString() + "@" + paragraphEditText.getText().toString();

            FileOutputStream fos = null;
            String fileName = "example";
            String FILE_NAME;

            try{

                FILE_NAME = fileName + fileNumber + ".txt";

                fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
                fos.write(text.getBytes());

                Toast.makeText(this, "Saved to " + getFilesDir() + "/" + FILE_NAME, Toast.LENGTH_LONG).show();

                showCustomSkills();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

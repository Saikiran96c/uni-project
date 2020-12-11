package com.example.lifeskillsv20;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomSkills extends AppCompatActivity {

    private String noSkillFound = "No skill saved";
    private String noSkillParagraph = "Tap create to add a skill";
    private Button b1;
    private Button b2;
    private Button b3;
    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView p1;
    private TextView p2;
    private TextView p3;
    private ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_skills);

        t1 = findViewById(R.id.skill1Title);
        t2 = findViewById(R.id.skill2Title);
        t3 = findViewById(R.id.skill3Title);
        p1 = findViewById(R.id.skill1Paragraph);
        p2 = findViewById(R.id.skill2Paragraph);
        p3 = findViewById(R.id.skill3Paragraph);

        b1 = findViewById(R.id.createButton1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), CreateSkill.class);
                String skillNo = "0";
                intent.putExtra(Intent.EXTRA_TEXT, skillNo);
                startActivity(intent);
            }
        });

        b2 = findViewById(R.id.createButton2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), CreateSkill.class);
                String skillNo = "1";
                intent.putExtra(Intent.EXTRA_TEXT, skillNo);
                startActivity(intent);
            }
        });

        b3 = findViewById(R.id.createButton3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), CreateSkill.class);
                String skillNo = "2";
                intent.putExtra(Intent.EXTRA_TEXT, skillNo);
                startActivity(intent);
            }
        });

        i1 = findViewById(R.id.homebtn);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });

        load();
        load2();
        load3();
    }

    public void delete(View view) {
        File file = new File(getFilesDir(),"example0.txt");
        file.delete();
        load();
    }

    public void delete2(View view) {
        File file = new File(getFilesDir(),"example1.txt");
        file.delete();
        load2();
    }

    public void delete3(View view) {
        File file = new File(getFilesDir(),"example2.txt");
        file.delete();
        load3();
    }

    public void load() {
        FileInputStream fis = null;
        int skillNo = 0;

        String fileName = ("example" + skillNo + ".txt");
        File file = new File(getFilesDir(),"example0.txt");

        if (file.exists() && file.isFile()) {
            try {
                fis = openFileInput(fileName);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                StringBuilder sb = new StringBuilder();
                String text;

                while ((text = br.readLine()) != null) {
                    sb.append(text).append("\n");
                }
                String finalText = sb.toString();
                String[] arrOfStr = finalText.split("@", 3);
                int count = 0;
                for (String a : arrOfStr) {
                    count++;
                }
                if (count == 2) {
                    t1.setText(arrOfStr[0]);
                    p1.setText(arrOfStr[1]);
                }
            } catch (FileNotFoundException e) {
                t1.setText(noSkillFound);
                p1.setText(noSkillParagraph);
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            t1.setText(noSkillFound);
            p1.setText(noSkillParagraph);
        }
    }

    public void load2() {
        FileInputStream fis = null;
        int skillNo = 1;

        String fileName = ("example" + skillNo + ".txt");
        File file = new File(getFilesDir(),"example1.txt");

        if (file.exists() && file.isFile()) {
            try {
                fis = openFileInput(fileName);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                StringBuilder sb = new StringBuilder();
                String text;

                while ((text = br.readLine()) != null) {
                    sb.append(text).append("\n");
                }

                String finalText = sb.toString();
                String[] arrOfStr = finalText.split("@", 3);
                int count = 0;

                for (String a : arrOfStr) {
                    count++;
                }

                if (count == 2) {
                    t2.setText(arrOfStr[0]);
                    p2.setText(arrOfStr[1]);
                }

            } catch (FileNotFoundException e) {
                t2.setText(noSkillFound);
                p2.setText(noSkillParagraph);
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            t2.setText(noSkillFound);
            p2.setText(noSkillParagraph);
        }
    }

    public void load3() {
        FileInputStream fis = null;
        int skillNo = 2;

        String fileName = ("example" + skillNo + ".txt");
        File file = new File(getFilesDir(),"example2.txt");

        if (file.exists() && file.isFile()) {
            try {
                fis = openFileInput(fileName);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                StringBuilder sb = new StringBuilder();
                String text;
                while ((text = br.readLine()) != null) {
                    sb.append(text).append("\n");
                }
                String finalText = sb.toString();
                String[] arrOfStr = finalText.split("@", 3);
                int count = 0;
                for (String a : arrOfStr) {
                    count++;
                }
                if (count == 2) {
                    t3.setText(arrOfStr[0]);
                    p3.setText(arrOfStr[1]);
                }
            } catch (FileNotFoundException e) {
                t3.setText(noSkillFound);
                t3.setText(noSkillParagraph);
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            t3.setText(noSkillFound);
            p3.setText(noSkillParagraph);
        }
    }


}

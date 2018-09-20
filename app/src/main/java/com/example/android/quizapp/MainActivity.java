package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;
    Button submit;
    CheckBox q2a;
    CheckBox q2b;
    CheckBox q3a;
    CheckBox q3b;
    CheckBox q3c;
    RadioButton q1s;
    RadioButton q4s;
    RadioButton q5s;
    RadioButton q6s;
    RadioButton q7s;
    EditText q2s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q2a = (CheckBox) findViewById(R.id.q2a);
        q2b = (CheckBox) findViewById(R.id.q2b);
        q3a = (CheckBox) findViewById(R.id.q3a);
        q3b = (CheckBox) findViewById(R.id.q3b);
        q3c = (CheckBox) findViewById(R.id.q3c);

        q2s = (EditText) findViewById(R.id.q2_field);
        q1s = (RadioButton) findViewById(R.id.q1s);
        q4s = (RadioButton) findViewById(R.id.q4s);
        q5s = (RadioButton) findViewById(R.id.q5s);
        q6s = (RadioButton) findViewById(R.id.q6s);
        q7s = (RadioButton) findViewById(R.id.q7s);

        submit = (Button) findViewById(R.id.submit_area);

    }

    public void score(View view) {
        if (q1s.isChecked()) {
            score++;
        }
        if ((!q2a.isChecked()) && (!q2b.isChecked()) && (q2s.getText().toString().equalsIgnoreCase("100 Million"))) {
            score++;
        }
        if (q3a.isChecked() && q3b.isChecked() && !q3c.isChecked()) {
            score++;
        }
        if (q4s.isChecked()) {
            score++;
        }
        if (q5s.isChecked()) {
            score++;
        }
        if (q6s.isChecked()) {
            score++;
        }
        if (q7s.isChecked()) {
            score++;
        }

        if (score == 7) {

            Toast.makeText(this, "Well Done " + score, Toast.LENGTH_SHORT).show();
            score = 0;

        } else {

            Toast.makeText(this, "You score " + score, Toast.LENGTH_SHORT).show();
            score = 0;
        }
    }
}

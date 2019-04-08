package com.example.iliendo.logicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTextViewAnswer1;
    private TextView mTextViewAnswer2;
    private TextView mTextViewAnswer3;
    private TextView mTextViewAnswer4;

    private Button mCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing views
        mTextViewAnswer1 = findViewById(R.id.textViewAnswer1);
        mTextViewAnswer2 = findViewById(R.id.textViewAnswer2);
        mTextViewAnswer3 = findViewById(R.id.textViewAnswer3);
        mTextViewAnswer4 = findViewById(R.id.textViewAnswer4);

        mCheck = findViewById(R.id.buttonCheck);

        mCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswers();
            }
        });
    }

    /**
     * Checks if the answers provided are correct
     */
    private void checkAnswers() {
        String T = "T";
        String F = "F";

        if (mTextViewAnswer1.getText().toString().equals(T) &&
                mTextViewAnswer2.getText().toString().equals(T) &&
                mTextViewAnswer3.getText().toString().equals(T) &&
                mTextViewAnswer4.getText().toString().equals(F)){
            Toast.makeText(this, "Well done", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong, try again...", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElfQuestionOneActivity extends AppCompatActivity {
    private Button stronglyAgreeButton, agreeButton, neutralButton, disagreeButton, stronglyDisagreeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elf_question_one);

        stronglyAgreeButton = (Button) findViewById(R.id.strongly_agree);
        agreeButton = (Button) findViewById(R.id.agree);
        neutralButton = (Button) findViewById(R.id.neutral);
        disagreeButton = (Button)   findViewById(R.id.disagree);
        stronglyDisagreeButton = (Button) findViewById(R.id.strongly_disagree);

        stronglyAgreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ElfQuestionOneActivity.this, ElfQuestionTwoActivity.class);
                startActivity(myIntent);
            }

        });
        agreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ElfQuestionOneActivity.this, ElfQuestionTwoActivity.class);
                startActivity(myIntent);
            }
        });
        neutralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ElfQuestionOneActivity.this, ElfQuestionTwoActivity.class);
                startActivity(myIntent);
            }
        });
        disagreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ElfQuestionOneActivity.this, OrcQuestionOneActivity.class);
                startActivity(myIntent);
            }
        });
        stronglyDisagreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ElfQuestionOneActivity.this, OrcQuestionOneActivity.class);
                startActivity(myIntent);
            }
        });
    }
}

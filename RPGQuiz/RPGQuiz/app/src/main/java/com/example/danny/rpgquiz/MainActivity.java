package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button raceQuizButton;
    private Button playstyleQuizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        raceQuizButton = (Button) findViewById(R.id.race_button);
        playstyleQuizButton = (Button) findViewById(R.id.playtype_button);

        raceQuizButton.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              Intent myIntent = new Intent( MainActivity.this,
                      RaceQuestionOne.class);
              startActivity(myIntent);
          }
        });
        playstyleQuizButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( MainActivity.this,
                        PlaystyleQuestionOneActivity.class);
                startActivity(myIntent);
            }
        });

    }
}

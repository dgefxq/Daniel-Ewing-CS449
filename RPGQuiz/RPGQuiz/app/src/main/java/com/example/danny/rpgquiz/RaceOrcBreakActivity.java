package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RaceOrcBreakActivity extends AppCompatActivity {
    private Button yesButton;
    private  Button noButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race_orc_break);
        yesButton = (Button) findViewById(R.id.yesHuman);
        noButton = (Button) findViewById(R.id.noHuman);

        yesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( RaceOrcBreakActivity.this,
                        OrcActivity.class);
                startActivity(myIntent);
            }
        });
        noButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( RaceOrcBreakActivity.this,
                        RaceGoblinBreakActivity.class);
                startActivity(myIntent);
            }
        });
    }
}

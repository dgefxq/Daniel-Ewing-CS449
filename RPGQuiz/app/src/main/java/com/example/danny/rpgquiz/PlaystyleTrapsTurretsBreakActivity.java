package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaystyleTrapsTurretsBreakActivity extends AppCompatActivity {
    private Button yesButton;
    private  Button noButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playstyle_traps_turrets_break);
        yesButton = (Button) findViewById(R.id.yesHuman);
        noButton = (Button) findViewById(R.id.noHuman);

        yesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( PlaystyleTrapsTurretsBreakActivity.this,
                        EngineerActivity.class);
                startActivity(myIntent);
            }
        });
        noButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( PlaystyleTrapsTurretsBreakActivity.this,
                        HunterActivity.class);
                startActivity(myIntent);
            }
        });
    }
}

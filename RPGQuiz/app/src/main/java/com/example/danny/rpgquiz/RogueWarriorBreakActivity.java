package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RogueWarriorBreakActivity extends AppCompatActivity {
    private Button warriorButton;
    private  Button rogueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rogue_warrior_break);
        warriorButton = (Button) findViewById(R.id.Warrior);
        rogueButton = (Button) findViewById(R.id.Rogue);

        warriorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( RogueWarriorBreakActivity.this,
                        WarriorActivity.class);
                startActivity(myIntent);
            }
        });
        rogueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( RogueWarriorBreakActivity.this,
                       RogueActivity.class);
                startActivity(myIntent);
            }
        });
    }
}

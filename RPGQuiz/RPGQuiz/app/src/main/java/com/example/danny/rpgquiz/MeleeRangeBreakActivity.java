package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeleeRangeBreakActivity extends AppCompatActivity {
    private Button meleeButton;
    private  Button rangeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melee_range_break);
        meleeButton = (Button) findViewById(R.id.melee);
        rangeButton = (Button) findViewById(R.id.range);

        meleeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( MeleeRangeBreakActivity.this,
                        PlaystyleQuestionTwoMeleeActivity.class);
                startActivity(myIntent);
            }
        });
        rangeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( MeleeRangeBreakActivity.this,
                        PlaystyleQuestionTwoRangeActivity.class);
                startActivity(myIntent);
            }
        });
    }
}

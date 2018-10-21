package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaystyleRangeMagicPhysicalBreakActivity extends AppCompatActivity {
    private Button physicalButton;
    private  Button magicButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playstyle_range_magic_physical_break);
        physicalButton = (Button) findViewById(R.id.physical);
        magicButton = (Button) findViewById(R.id.magic);

        physicalButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( PlaystyleRangeMagicPhysicalBreakActivity.this,
                        PlaystyleTrapsTurretsBreakActivity.class);
                startActivity(myIntent);
            }
        });
        magicButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( PlaystyleRangeMagicPhysicalBreakActivity.this,
                        PlaystyleQuestionThreeRangeActivity.class);
                startActivity(myIntent);
            }
        });
    }
}

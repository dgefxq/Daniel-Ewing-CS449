package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.appmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // needs overwritten with an activity for displaying information about the application.
        switch (item.getItemId()){
            case R.id.about_menu_item:{
                Intent myIntent = new Intent( MeleeRangeBreakActivity.this,
                        AboutActivity.class);
                startActivity(myIntent);
                return true;
            }

            case R.id.playstyle_menu_item:{
                Intent myIntent = new Intent( MeleeRangeBreakActivity.this,
                        PlaystyleQuestionOneActivity.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.race_menu_item:{
                Intent myIntent = new Intent( MeleeRangeBreakActivity.this,
                        RaceQuestionOne.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.main_menu_item:{
                Intent myIntent = new Intent( MeleeRangeBreakActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
                return true;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}

package com.example.danny.rpgquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PlaystyleQuestionThreeMeleeActivity extends AppCompatActivity {

    private Button stronglyAgreeButton, agreeButton, neutralButton, disagreeButton, stronglyDisagreeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playstyle_question_three_melee);

        stronglyAgreeButton = (Button) findViewById(R.id.strongly_agree);
        agreeButton = (Button) findViewById(R.id.agree);
        neutralButton = (Button) findViewById(R.id.neutral);
        disagreeButton = (Button)   findViewById(R.id.disagree);
        stronglyDisagreeButton = (Button) findViewById(R.id.strongly_disagree);

        stronglyAgreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PlaystyleQuestionThreeMeleeActivity.this, WarriorActivity.class);
                startActivity(myIntent);
            }
        });
        agreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PlaystyleQuestionThreeMeleeActivity.this, WarriorActivity.class);
                startActivity(myIntent);
            }
        });
        neutralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PlaystyleQuestionThreeMeleeActivity.this, PlaystylePlaceHolderActivity.class);
                startActivity(myIntent);
            }
        });
        disagreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PlaystyleQuestionThreeMeleeActivity.this, RogueActivity.class);
                startActivity(myIntent);
            }
        });
        stronglyDisagreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PlaystyleQuestionThreeMeleeActivity.this, RogueActivity.class);
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
                Intent myIntent = new Intent( PlaystyleQuestionThreeMeleeActivity.this,
                        AboutActivity.class);
                startActivity(myIntent);
                return true;
            }

            case R.id.playstyle_menu_item:{
                Intent myIntent = new Intent( PlaystyleQuestionThreeMeleeActivity.this,
                        PlaystyleQuestionOneActivity.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.race_menu_item:{
                Intent myIntent = new Intent( PlaystyleQuestionThreeMeleeActivity.this,
                        RaceQuestionOne.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.main_menu_item:{
                Intent myIntent = new Intent( PlaystyleQuestionThreeMeleeActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
                return true;
            }

        }
        return super.onOptionsItemSelected(item);
    }

}

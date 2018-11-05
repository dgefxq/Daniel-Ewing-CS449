package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HumanBreakActivity extends AppCompatActivity {
    private Button yesButton;
    private  Button noButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_break);
        yesButton = (Button) findViewById(R.id.yesHuman);
        noButton = (Button) findViewById(R.id.noHuman);

        yesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( HumanBreakActivity.this,
                        HumanActivity.class);
                startActivity(myIntent);
            }
        });
        noButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( HumanBreakActivity.this,
                        ElfQuestionOneActivity.class);
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
                Intent myIntent = new Intent( HumanBreakActivity.this,
                        AboutActivity.class);
                startActivity(myIntent);
                return true;
            }

            case R.id.playstyle_menu_item:{
                Intent myIntent = new Intent( HumanBreakActivity.this,
                        PlaystyleQuestionOneActivity.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.race_menu_item:{
                Intent myIntent = new Intent( HumanBreakActivity.this,
                        RaceQuestionOne.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.main_menu_item:{
                Intent myIntent = new Intent( HumanBreakActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
                return true;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}

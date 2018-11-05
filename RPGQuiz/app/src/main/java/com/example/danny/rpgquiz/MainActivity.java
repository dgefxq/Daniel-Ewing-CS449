package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                Intent myIntent = new Intent( MainActivity.this,
                        AboutActivity.class);
                startActivity(myIntent);
                return true;
            }

            case R.id.playstyle_menu_item:{
                Intent myIntent = new Intent( MainActivity.this,
                        PlaystyleQuestionOneActivity.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.race_menu_item:{
                    Intent myIntent = new Intent( MainActivity.this,
                            RaceQuestionOne.class);
                    startActivity(myIntent);
                    return true;
            }
            case R.id.main_menu_item:{
                Intent myIntent = new Intent( MainActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
                return true;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}

package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PlaystyleRangeHealingDamageBreakActivity extends AppCompatActivity {
    private Button damageButton;
    private  Button healButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playstyle_melee_magic_damage_heal_break);
        damageButton = (Button) findViewById(R.id.damage);
        healButton = (Button) findViewById(R.id.heal);

        damageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( PlaystyleRangeHealingDamageBreakActivity.this,
                        MageActivity.class);
                startActivity(myIntent);
            }
        });
        healButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( PlaystyleRangeHealingDamageBreakActivity.this,
                        PriestActivity.class);
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
                Intent myIntent = new Intent( PlaystyleRangeHealingDamageBreakActivity.this,
                        AboutActivity.class);
                startActivity(myIntent);
                return true;
            }

            case R.id.playstyle_menu_item:{
                Intent myIntent = new Intent( PlaystyleRangeHealingDamageBreakActivity.this,
                        PlaystyleQuestionOneActivity.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.race_menu_item:{
                Intent myIntent = new Intent( PlaystyleRangeHealingDamageBreakActivity.this,
                        RaceQuestionOne.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.main_menu_item:{
                Intent myIntent = new Intent( PlaystyleRangeHealingDamageBreakActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
                return true;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}

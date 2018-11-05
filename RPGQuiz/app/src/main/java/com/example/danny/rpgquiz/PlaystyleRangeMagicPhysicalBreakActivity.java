package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
                Intent myIntent = new Intent( PlaystyleRangeMagicPhysicalBreakActivity.this,
                        AboutActivity.class);
                startActivity(myIntent);
                return true;
            }

            case R.id.playstyle_menu_item:{
                Intent myIntent = new Intent( PlaystyleRangeMagicPhysicalBreakActivity.this,
                        PlaystyleQuestionOneActivity.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.race_menu_item:{
                Intent myIntent = new Intent( PlaystyleRangeMagicPhysicalBreakActivity.this,
                        RaceQuestionOne.class);
                startActivity(myIntent);
                return true;
            }
            case R.id.main_menu_item:{
                Intent myIntent = new Intent( PlaystyleRangeMagicPhysicalBreakActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
                return true;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}

package com.example.danny.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaystyleMeleeMagicDamageHealBreak extends AppCompatActivity {
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
                Intent myIntent = new Intent( PlaystyleMeleeMagicDamageHealBreak.this,
                        ShamanActivity.class);
                startActivity(myIntent);
            }
        });
        healButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( PlaystyleMeleeMagicDamageHealBreak.this,
                        PaladinActivity.class);
                startActivity(myIntent);
            }
        });
    }
}

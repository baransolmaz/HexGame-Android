package com.example.hexgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((RadioButton)findViewById(R.id.type1)).setOnClickListener(new View.OnClickListener (){
                @Override
                public void onClick(View v) {
                                ((RadioGroup)findViewById(R.id.radio_bot)).setVisibility(View.INVISIBLE);
                }
        });
            ((RadioButton)findViewById(R.id.type2)).setOnClickListener(new View.OnClickListener (){
                    @Override
                    public void onClick(View v) {
                            ((RadioGroup)findViewById(R.id.radio_bot)).setVisibility(View.VISIBLE);
                    }
            });

        ((Button) findViewById(R.id.start_button)).setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                            Intent game = new Intent(MainActivity.this, BoardActivity.class);

                            final RadioGroup rg_type = (RadioGroup) findViewById(R.id.radio_type);
                            int selected_type = rg_type.getCheckedRadioButtonId();
                            game.putExtra("gameType", ((RadioButton) findViewById(selected_type)).getText().toString());

                            final RadioGroup rg_size = (RadioGroup) findViewById(R.id.radio_size);
                            int selected_size = rg_size.getCheckedRadioButtonId();
                            game.putExtra("gameSize", ((RadioButton) findViewById(selected_size)).getText().toString());

                            if (rg_type.getCheckedRadioButtonId() == ((RadioButton) findViewById(R.id.type2)).getId()) {
                                final RadioGroup rg_bot = (RadioGroup) findViewById(R.id.radio_bot);
                                int selected_bot = rg_bot.getCheckedRadioButtonId();
                                game.putExtra("botLevel", ((RadioButton) findViewById(selected_bot)).getText().toString());
                            }
                            finish();
                            startActivity(game);
                    }
        });
            ((ImageButton) findViewById(R.id.info_button)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Intent info= new Intent(MainActivity.this, InfoActivity.class);
                            startActivity(info);
                    }
            });



    }






}//

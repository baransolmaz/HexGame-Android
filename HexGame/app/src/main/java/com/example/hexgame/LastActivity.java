package com.example.hexgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {
		TextView score,winner;
		Button new_b,close_b;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.activity_last);
				Intent board=getIntent();
				score=(TextView)findViewById(R.id.score_winner);
				winner=(TextView)findViewById(R.id.winner);
				score.setText(board.getStringExtra("winner_score"));
				winner.setText(board.getStringExtra("winner"));
				new_b=(Button)findViewById(R.id.newgame_but);
				close_b=(Button)findViewById(R.id.close_but);
				new_b.setOnClickListener(new View.OnClickListener (){
						@Override
						public void onClick(View v) {
								Intent main=new Intent(LastActivity.this,MainActivity.class);
								finish();
								startActivity(main);
						}
				});
				close_b.setOnClickListener(new View.OnClickListener (){
						@Override
						public void onClick(View v) {
								finish();
						}
				});

		}
}
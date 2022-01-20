package com.example.hexgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InfoActivity extends AppCompatActivity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.activity_info);
				((ImageButton) findViewById(R.id.backTo_main)).setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
								finish();
						}
				});
		}
}
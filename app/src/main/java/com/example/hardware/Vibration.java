package com.example.hardware;

import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Vibration extends Activity {
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vibration);		
		b1=(Button)findViewById(R.id.but101);
		b1.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Vibrator v1 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				v1.vibrate(400);
				Toast.makeText(getApplicationContext(), "Your Vibration Working Very Well",Toast.LENGTH_SHORT).show();
			}
		});
	}
}

package com.example.hardware;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class TouchSensor extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new SingleTouchEventView(this, null));
		
	}
}

package com.example.hardware;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Gravitysensor extends Activity implements SensorEventListener{
    TextView tvx,tvy,tvz;
    SensorManager sensmgr;
    Sensor accsensor;
    float[] sensorvalues;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gravitysensor);
		
		tvx=(TextView)findViewById(R.id.textView70);
		tvy=(TextView)findViewById(R.id.textView71);
		tvz=(TextView)findViewById(R.id.textView72);
		
		sensmgr=(SensorManager)getSystemService(SENSOR_SERVICE);
		accsensor=sensmgr.getDefaultSensor(Sensor.TYPE_GRAVITY);
	}

	@Override
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gravitysensor, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
   sensorvalues=event.values;
   float x=sensorvalues[0];
   float y=sensorvalues[1];
   float z=sensorvalues[2];	
   tvx.setText("x "+x+" ms^2");
   tvy.setText("y "+y+" ms^2");
   tvz.setText("z "+z+" ms^2");
	}
	

	@Override
	protected void onResume() {
  sensmgr.registerListener(this,accsensor,SensorManager.SENSOR_DELAY_NORMAL);

  super.onResume();
	}
	

	@Override
	protected void onPause() {
		sensmgr.unregisterListener(this);
		super.onPause();
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}
}

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


public class Magneticsensor extends Activity implements SensorEventListener{
    TextView tvx,tvy,tvz;
    SensorManager sensmgr;
    Sensor magsensor;
    float[] sensorvalues;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_magneticsensor);
		
		tvx=(TextView)findViewById(R.id.textView4);
		tvy=(TextView)findViewById(R.id.textView5);
		tvz=(TextView)findViewById(R.id.textView6);
		
		sensmgr=(SensorManager)getSystemService(SENSOR_SERVICE);
		magsensor=sensmgr.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
	}

	@Override
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.magneticsensor, menu);
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
   tvx.setText("x "+x+" uT");
   tvy.setText("y "+y+" uT");
   tvz.setText("z "+z+" uT");
   
   
	}
	

	@Override
	protected void onResume() {
  sensmgr.registerListener(this,magsensor,SensorManager.SENSOR_DELAY_NORMAL);

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

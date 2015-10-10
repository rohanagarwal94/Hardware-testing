package com.example.hardware;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Gpsloc extends Activity{
    
   TextView tr,ts;
   double latitude,longitude;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpsloc);
        Gpslocate gps = new Gpslocate(this);
        latitude = gps.getLatitude();
        longitude = gps.getLongitude();
        tr=(TextView)findViewById(R.id.textView60);
        ts=(TextView)findViewById(R.id.textView61);
        
    }

	@Override
	protected void onStart() {
		tr.setText("latitude "+String.valueOf(latitude));
		ts.setText("longitude "+String.valueOf(longitude));
		super.onStart();
	}
    
    }
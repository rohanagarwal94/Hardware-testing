package com.example.hardware;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;

import android.widget.Toast;

public class Tele extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tele);
		
		 TelephonyManager telMgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		    int simState = telMgr.getSimState();
		            switch (simState) {
		                case TelephonyManager.SIM_STATE_ABSENT:
		                    Toast.makeText(getApplicationContext(), "Sim State Absent",Toast.LENGTH_SHORT).show();
		                    break;
		                case TelephonyManager.SIM_STATE_NETWORK_LOCKED:
		                	Toast.makeText(getApplicationContext(), "Sim State Network Locked",Toast.LENGTH_SHORT).show();// do something
		                    break;
		                case TelephonyManager.SIM_STATE_PIN_REQUIRED:
		                	Toast.makeText(getApplicationContext(), "Sim State Pin Required",Toast.LENGTH_SHORT).show(); // do something
		                    break;
		                case TelephonyManager.SIM_STATE_PUK_REQUIRED:
		                	Toast.makeText(getApplicationContext(), "Sim State Puk Required",Toast.LENGTH_SHORT).show();// do something
		                    break;
		                case TelephonyManager.SIM_STATE_READY:
		                	Toast.makeText(getApplicationContext(), "Sim State Ready",Toast.LENGTH_SHORT).show();// do something
		                    break;
		                case TelephonyManager.SIM_STATE_UNKNOWN:
		                	Toast.makeText(getApplicationContext(), "Sim State Unknown",Toast.LENGTH_SHORT).show(); // do something
		                    break;
		            } 
	}
}

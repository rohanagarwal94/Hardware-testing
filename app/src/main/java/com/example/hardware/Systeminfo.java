package com.example.hardware;

import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import android.widget.TextView;


public class Systeminfo extends Activity {
TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_systeminfo);
		t1=(TextView) findViewById(R.id.textView1a);
		t2=(TextView) findViewById(R.id.textView2a);
		t3=(TextView) findViewById(R.id.textView3a);
		t4=(TextView) findViewById(R.id.textView4a);
		t5=(TextView) findViewById(R.id.textView5a);
		t6=(TextView) findViewById(R.id.textView6a);
		t7=(TextView) findViewById(R.id.textView7a);
		t8=(TextView) findViewById(R.id.textView8a);
		t9=(TextView) findViewById(R.id.textView9a);
	
	
	
	    
	}
	@Override
		protected void onStart() {
		String release = Build.VERSION.RELEASE;
	    int sdkVersion = Build.VERSION.SDK_INT;
	    String q=Build.VERSION.CODENAME;
	    String t=Build.VERSION.INCREMENTAL;
	    String m=Build.BOARD;
	    
	    String h=Build.BOOTLOADER;
	    String j=Build.BRAND;
	    String k=Build.DEVICE;
	    
	    String z=Build.HARDWARE;
	    
	    String c=Build.MANUFACTURER;
	    String b=Build.SERIAL;
	    t3.setText("Name of underlying board " +m);
	    t4.setText("System bootloader version number " +h);
	    t5.setText("Brand of the software is  " +j);
	    t6.setText("Name of the industrial design " +k);
	    t7.setText("Name of the ternel "+z);
	    t8.setText("Manufacturer of the product" +c);
	    t9.setText("Hardware serial number " +b);

t2.setText("Build no :" +t);
t1.setText("Android SDK: " + sdkVersion + q +" (" + release +")");
			super.onStart();
			
			/* final TelephonyManager tm =(TelephonyManager)getBaseContext().getSystemService(Context.TELEPHONY_SERVICE);

			  String deviceid = tm.getDeviceId();
			   int phone = tm.getPhoneType();
Toast.makeText(getApplicationContext(),deviceid +"and"+ phone,Toast.LENGTH_SHORT).show();*/
	}
}
	

package com.example.hardware;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Blueadd extends Activity {
    BluetoothAdapter mBluetoothAdapter;
    TextView r,t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blueadd);
		
		r=(TextView)findViewById(R.id.textView12);
		t=(TextView)findViewById(R.id.textView41);
		r.setText("name "+getLocalBluetoothName());
		t.setText("address "+getLocalBluetoothAddress());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.blueadd, menu);
		return true;
	}
	public String getLocalBluetoothName(){
	    if(mBluetoothAdapter == null){
	        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	    }
	    String name = mBluetoothAdapter.getName();
	    if(name == null){
	        System.out.println("Name is null!");
	    }
	      
	    return name;
	}
	public String getLocalBluetoothAddress(){
	    if(mBluetoothAdapter == null){
	        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	    }
	    String address = mBluetoothAdapter.getAddress();
	    if(address == null){
	        System.out.println("Address is null!");
	    }
	      
	    return address;
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
}

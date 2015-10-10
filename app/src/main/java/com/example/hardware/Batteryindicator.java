package com.example.hardware;

import android.app.Activity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import android.widget.TextView;
 
public class Batteryindicator extends Activity {
        //Create Broadcast Receiver Object along with class definition
    private BroadcastReceiver mBatInfoReceiver = new BroadcastReceiver() {
        @Override
          //When Event is published, onReceive method is called
        public void onReceive(Context c, Intent i) {
              //Get Battery %
            int level = i.getIntExtra("level", 0);
              //Find the progressbar creating in main.xml
            ProgressBar pb = (ProgressBar) findViewById(R.id.progressbar);
              //Set progress level with battery % value
            pb.setProgress(level);
              //Find textview control created in main.xml
            TextView tv = (TextView) findViewById(R.id.textfield);
              //Set TextView with text
            tv.setText("Battery Level: " + Integer.toString(level) + "%");
        }
 
    };
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           //Set layout we created
        setContentView(R.layout.activity_batteryindicator);
    
      
        registerReceiver(mBatInfoReceiver, new IntentFilter(
                Intent.ACTION_BATTERY_CHANGED));
    }
}
package com.example.hardware;



import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class Display extends Activity {
	int [] a;
	RelativeLayout r;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		r=(RelativeLayout) findViewById(R.id.rr);
		a=new int[10];
		a[0]=Color.parseColor("#f4c2c6");
		a[1]=Color.parseColor("#c7afce");
		a[2]=Color.parseColor("#fbcab3");
		a[3]=Color.parseColor("#ffe8f4");
		a[4]=Color.parseColor("#525252");
		a[5]=Color.parseColor("#bcdbbe");
		a[6]=Color.parseColor("#1ca589");
		a[7]=Color.parseColor("#c1073f");
		a[8]=Color.parseColor("#edcdc3");
		a[9]=Color.parseColor("#ecffef");

		
		}
		public boolean onTouchEvent(android.view.MotionEvent event){
		int x=(int) (Math.random()*10);
		r.setBackgroundColor(a[x]);
			return false;
			} 
		
}

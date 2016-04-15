package com.example.vibratedemo;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
Vibrator v;
Button btn1,btn2;
int viberate=30;
int interval=1000;
int dot=1;
int shortgap=1;
long[] a={0,viberate,interval,dot,shortgap};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1=(Button) findViewById(R.id.button1);
		btn2=(Button) findViewById(R.id.button2);
		v=(Vibrator) getSystemService(VIBRATOR_SERVICE);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				v.vibrate(a,dot);
			}
		});
		
		
btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				v.cancel();
			}
		});
		
	}

	
}

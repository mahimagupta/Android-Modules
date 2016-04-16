package com.example.ratingdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
RatingBar rb;
TextView tv;
Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView) findViewById(R.id.textView1);
		rb=(RatingBar) findViewById(R.id.ratingBar1);
		btn=(Button) findViewById(R.id.button1);
		rb.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
				// TODO Auto-generated method stub
			tv.setText(""+arg1);	
			}
		});
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String value=String.valueOf(rb.getRating());
			Toast.makeText(MainActivity.this,""+value,1).show();
			}
		});
	}
}

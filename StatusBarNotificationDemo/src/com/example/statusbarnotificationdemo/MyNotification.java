package com.example.statusbarnotificationdemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyNotification extends Activity {
Notification n;
NotificationManager nm;
PendingIntent pi;
Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_notification);
		btn=(Button) findViewById(R.id.button1);
		nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			n=new Notification(R.drawable.ic_launcher,"HI ANDROID",System.currentTimeMillis());
			Intent i=new Intent();
			pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0,null);
			n.setLatestEventInfo(getApplicationContext(), "XXXX", "YOU HAVE A NEW MESSAGE!",pi);
			nm.notify(1,n);
			finish();
		}
	});
}}
package com.example.spinnerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
Spinner sp;
String str[]={"ONE","TWO","THREE"};
ArrayAdapter<String> aa;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sp=(Spinner) findViewById(R.id.spinner1);
		aa=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,str);
		sp.setAdapter(aa);
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				Object ab=sp.getItemAtPosition(arg2);
				if(ab.equals("ONE"))
				{
					Toast.makeText(MainActivity.this,"This is First", 1).show();
				}
				else if(ab.equals("TWO"))
				{

					Toast.makeText(MainActivity.this,"This is Second", 1).show();
				}
				else
				{

					Toast.makeText(MainActivity.this,"This is Third", 1).show();
				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	}

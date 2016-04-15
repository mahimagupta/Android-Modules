package com.example.autocompletedemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
AutoCompleteTextView actv;
String str[]={"C","C++","COMBO","JAVA","PHP","PHYTHON","DOT NET","ADO DOT NET"};
ArrayAdapter<String> aa;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		actv=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		aa=new ArrayAdapter<String>(MainActivity.this,android.R.layout.select_dialog_item,str);
		actv.setAdapter(aa);
		actv.setThreshold(2);
		actv.setTextColor(Color.RED);
	}
}

package com.example.sharedprefsdemo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
Button btn1,btn2;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        tv=(TextView) findViewById(R.id.textView1);
        
btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
	displayPreferenceInfo();			
			}

			private void displayPreferenceInfo() {
				// TODO Auto-generated method stub
 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);  
	           String username = prefs.getString("username", "Default NickName");  
	           String passw = prefs.getString("password", "Default Password");  
	           boolean checkBox = prefs.getBoolean("checkBox", false);  
	           String listPrefs = prefs.getString("listoptions", "Default list prefs");  
  
	           
           StringBuilder builder = new StringBuilder();  
	           builder.append("Username: " + username + "\n");  
           builder.append("Password: " + passw + "\n");  
           builder.append("Keep me logged in: " + String.valueOf(checkBox) + "\n");  
	       builder.append("List preference: " + listPrefs);  
           tv.setText(""+builder);  
	      
	
			}
		});
btn2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i=new Intent(MainActivity.this,PreferenceActivityDemo.class);
		startActivity(i);
	}
});

        		
    }
}

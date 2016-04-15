package com.example.searchview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.Toast;

public class MainActivity extends Activity {
SearchView sv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sv=(SearchView)findViewById(R.id.searchView1);
				sv.setOnQueryTextListener(new OnQueryTextListener() {
					
					@Override
					public boolean onQueryTextSubmit(String arg0) {
						// TODO Auto-generated method stub
						Toast.makeText(getApplicationContext(),""+arg0, 1).show();
						return false;
					}
					
					@Override
					public boolean onQueryTextChange(String arg0) {
						// TODO Auto-generated method stub
						return false;
					}
				});
	}


}

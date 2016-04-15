package com.example.expandablelistdemo;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;

public class MainActivity extends Activity {
	ExpandableListAdapter ea;
	ExpandableListView ev;
    List<String> l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ev=(ExpandableListView)findViewById(R.id.expandableListView1);
		ea = new ExpandableListAdapter(MainActivity.this,l, );
		ev.setAdapter(ea);
	  ev.setOnGroupExpandListener(new onGroupExpandListener)
		}
	
	 private void prepareListData() {
	        l = new ArrayList<String>();

	        l.add("Top 250");
	        l.add("Now Showing");
	        l.add("Coming Soon..");
	 
	       
	        List<String> top250 = new ArrayList<String>();
	        top250.add("The Shawshank Redemption");
	        top250.add("The Godfather");
	        top250.add("The Godfather: Part II");
	        top250.add("Pulp Fiction");
	        top250.add("The Good, the Bad and the Ugly");
	        top250.add("The Dark Knight");
	        top250.add("12 Angry Men");
	 
	        List<String> nowShowing = new ArrayList<String>();
	        nowShowing.add("The Conjuring");
	        nowShowing.add("Despicable Me 2");
	        nowShowing.add("Turbo");
	        nowShowing.add("Grown Ups 2");
	        nowShowing.add("Red 2");
	        nowShowing.add("The Wolverine");
	 
	        List<String> comingSoon = new ArrayList<String>();
	        comingSoon.add("2 Guns");
	        comingSoon.add("The Smurfs 2");
	        comingSoon.add("The Spectacular Now");
	        comingSoon.add("The Canyons");
	        comingSoon.add("Europa Report");
	 
	       
	    }
	}




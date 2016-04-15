package com.example.progressdemo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {
Button btn;
ProgressDialog pd;
int progress=0;
long filesize=0;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		pd=new ProgressDialog(MainActivity.this);
		pd.setTitle("MIET");
		pd.setMessage("Please Wait..");
		pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		pd.show();
		
		new Thread(new Runnable() {
			public void run() {
				while(progress<100)
				{
					progress=doSomeTask();
					try{
						Thread.sleep(1000);
						
					} catch (InterruptedException e){
						e.printStackTrace();
					}
					pd.setProgress(progress);
					
				}
			}
			private int doSomeTask(){
				while(filesize<1000000)
				{
					filesize++;
					if(filesize==100000)
					{
						return 10;
					}
					else if(filesize==200000)
					{
						return 20;
					}
					else if(filesize==400000)
					{
						return 40;
					}
					else if(filesize==700000)
					{
						return 70;
					}
					
				}
				return 100;
			}
		}).start();
	}
}



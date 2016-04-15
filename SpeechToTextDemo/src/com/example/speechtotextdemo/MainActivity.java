package com.example.speechtotextdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
Button btn;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button1);
        tv=(TextView) findViewById(R.id.textView1);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				speechInput();
			}

			private void speechInput() {
				// TODO Auto-generated method stub
				Intent i=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
				i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
				i.putExtra(RecognizerIntent.EXTRA_PROMPT,"SAY SOMETHING.....");
				startActivityForResult(i, 0);
			}
		});
        
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		switch (requestCode) {
		case 0:
			if(resultCode==RESULT_OK && data!=null)
			{
				ArrayList<String> aa=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
				tv.setText(aa.get(0));
			}
			break;

		default:
			break;
		}
	}
}

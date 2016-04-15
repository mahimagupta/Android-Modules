package com.example.texttospeech;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
EditText et1;
Button btn;
TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button1);
        et1=(EditText) findViewById(R.id.editText1);
        tts=new TextToSpeech(getApplicationContext(),new TextToSpeech.OnInitListener() {
			
			@Override
			public void onInit(int arg0) {
				// TODO Auto-generated method stub
			if(arg0!=TextToSpeech.ERROR)
			{
				tts.setLanguage(Locale.UK);
			}
			}
		});
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String str=et1.getText().toString();	
			tts.speak(str, TextToSpeech.QUEUE_FLUSH,null);
			}
		});
    }
}

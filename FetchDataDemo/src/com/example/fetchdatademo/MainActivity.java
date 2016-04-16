package com.example.fetchdatademo;



import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button btn;
	EditText et1;
	SQLiteDatabase sq;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et1=(EditText)findViewById(R.id.editText1);
		 btn=(Button)findViewById(R.id.button1);
		 tv=(TextView) findViewById(R.id.textView2);
		 sq=openOrCreateDatabase("mydb1", Context.MODE_PRIVATE, null);
	        btn.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					try {
					int id1;
					String qr1;
					id1=Integer.parseInt(et1.getText().toString());
					qr1="select * from details where id='"+id1+"'";
					Cursor c=sq.rawQuery(qr1, null);
					while(c.moveToNext())
					{
						tv.setText(""+c.getInt(1)+"\n"+c.getString(0));		
					}
				
				} catch (Exception e)
				{
					Toast.makeText(MainActivity.this,""+e, 1).show();
				}
				} 
				 }
	        );
	}
}

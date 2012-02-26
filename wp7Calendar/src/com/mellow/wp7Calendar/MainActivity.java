package com.mellow.wp7Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    
	public int addBy = 0;
	public int subBy = 0;
	
	int counter;
	Button add, sub, addNum, subNum;
	TextView tvDisplay, tvAdd, tvSub;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        addNum = (Button) findViewById(R.id.bAddNum);
        subNum = (Button) findViewById(R.id.bSubNum);
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvAdd = (TextView) findViewById(R.id.tvAdd);
        tvSub = (TextView) findViewById(R.id.tvSub);
        add.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter += addBy;
				tvDisplay.setText("Your total is:         " + counter);

			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter -= subBy;
				tvDisplay.setText("Your total is:         " + counter);
			}
		});
        addNum.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				addBy +=5;
				tvAdd.setText("Add by: " + addBy);
			}
		});
        subNum.setOnClickListener(new View.OnClickListener() {
	
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		subBy +=5;
        		tvSub.setText("Subtract by: " + subBy);
        	}
        });
    }
}
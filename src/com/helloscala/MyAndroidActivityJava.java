package com.helloscala;

import android.os.Bundle;
import android.widget.TextView;

public class MyAndroidActivityJava extends MyAndroidActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		final TextView textView = (TextView) findViewById(R.id.mytext);
		if (textView != null)
            textView.setText("Hello");
	}
	
}



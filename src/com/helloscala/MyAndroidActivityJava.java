package com.helloscala;

//import com.helloscala.Derivative.Sum;
//import com.helloscala.Derivative.Var;

import android.os.Bundle;
import android.widget.TextView;

public class MyAndroidActivityJava extends MyAndroidActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		final TextView textView = (TextView) findViewById(R.id.mytext);
		//      final Sum tree = new Sum(new Var("x"), new Var("x"));
		if (textView != null)
		textView.setText("Hello");
		textView.setText();
        	
    //    	textView.setText(tree.toString());
	}
	
}



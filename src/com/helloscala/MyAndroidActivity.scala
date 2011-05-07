package com.helloscala

import android.app.Activity
import android.os.Bundle

class MyAndroidActivity extends Activity {
	
    override def onCreate(savedInstanceState:Bundle) : Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }
}


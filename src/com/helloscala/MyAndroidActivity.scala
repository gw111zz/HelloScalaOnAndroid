package com.helloscala

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.helloscala.R
import util.Properties

class MyAndroidActivity extends Activity {

    override def onCreate(savedInstanceState:Bundle) : Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        Log.d("test", "yeah" + Properties.versionMsg.toString())
        Log.d("test", List(5, 6).map(_ * 2).toString())
    }
}


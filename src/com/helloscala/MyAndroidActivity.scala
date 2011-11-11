package com.helloscala

import android.app.Activity
import android.os.Bundle
import android.util.Log
import util.Properties
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView

class MyAndroidActivity extends Activity {

    override def onCreate(savedInstanceState:Bundle) : Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val myLayout = findViewById( R.id.mytext ).asInstanceOf[TextView]
        myLayout.setText("This demo was done with: [" + Properties.versionMsg.toString()  + "]")
        Log.d("test", "yeah" + Properties.versionMsg.toString())
        Log.d("test", List(5, 6).map(_ * 2).toString())

    }
}

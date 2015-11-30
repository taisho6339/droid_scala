package com.taishonet.droid.scala

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity extends AppCompatActivity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    startActivity(ListViewActivity.intentOf(this))
  }
}

package com.taishonet.droid.scala

import android.content.{Context, Intent}
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class ListViewActivity extends AppCompatActivity {

  var listView: ListView = null

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    listView = findViewById(R.id.list_view).asInstanceOf[ListView]
  }
}

object ListViewActivity extends AppCompatActivity {
  def intentOf(c: Context): Intent = {
    new Intent(c, classOf[ListViewActivity])
  }
}

package com.taishonet.droid.scala.activities

import java.util

import android.content.{Context, Intent}
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import com.taishonet.droid.scala.R
import com.taishonet.droid.scala.data.Message
import com.taishonet.droid.scala.di.{ListBTrait, ListATrait}

class ListViewActivity extends AppCompatActivity with ListBTrait {

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_list)

    var list = new util.ArrayList[Message]();
    List.range(0, 10).foreach(i => list.add(createMessage("テスト" + i, "")))

    val listView = findViewById(R.id.list_view).asInstanceOf[ListView]
    listView.setAdapter(getAdapter(this, list))
  }

  def createMessage(title: String, message: String): Message = {
    Message(title, message)
  }
}

object ListViewActivity extends AppCompatActivity {
  def intentOf(c: Context): Intent = {
    new Intent(c, classOf[ListViewActivity])
  }
}

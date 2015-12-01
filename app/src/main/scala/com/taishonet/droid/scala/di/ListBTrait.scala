package com.taishonet.droid.scala.di

import java.util

import android.content.Context
import android.widget.BaseAdapter
import com.taishonet.droid.scala.adapters.ListBAdapter
import com.taishonet.droid.scala.data.Message

trait ListBTrait extends SampleAdapterModule {
  override def getAdapter(c: Context, messages: util.ArrayList[Message]): BaseAdapter = {
    new ListBAdapter(c, messages)
  }
}
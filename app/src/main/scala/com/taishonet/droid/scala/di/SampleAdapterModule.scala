package com.taishonet.droid.scala.di

import java.util

import android.content.Context
import android.widget.BaseAdapter
import com.taishonet.droid.scala.data.Message

trait SampleAdapterModule {
  def getAdapter(c: Context, messages: util.ArrayList[Message]): BaseAdapter
}
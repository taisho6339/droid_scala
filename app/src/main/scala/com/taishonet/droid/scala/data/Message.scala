package com.taishonet.droid.scala.data

class Message(val t: String, val m: String) {
  val title = t
  val message = m
}

object Message {
  def apply(t: String, m: String) = {
    new Message(t, m)
  }
}

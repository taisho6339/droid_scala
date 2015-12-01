package com.taishonet.droid.scala.adapters

import java.util

import android.content.Context
import android.view.{View, ViewGroup}
import android.widget.{BaseAdapter, ImageView, TextView}
import com.taishonet.droid.scala.R
import com.taishonet.droid.scala.data.Message

/**
 * 今回はListAAdapterとほぼ一緒のレイアウトのため、
 * Viewの描画処理が似通っている
 */
class ListBAdapter(c: Context, list: util.ArrayList[Message]) extends BaseAdapter {

  override def getCount(): Int = {
    list.size()
  }

  override def getItem(i: Int): Object = {
    list.get(i)
  }

  override def getItemId(i: Int): Long = {
    0
  }

  def getViewHolder(convertView: View): ViewHolder = {
    if (convertView == null) {
      val view = View.inflate(c, R.layout.list_item_b, null)
      val imageView = view.findViewById(R.id.icon).asInstanceOf[ImageView]
      val titleView = view.findViewById(R.id.title).asInstanceOf[TextView]
      val messageView = view.findViewById(R.id.message).asInstanceOf[TextView]
      new ViewHolder(imageView, titleView, messageView)
    } else {
      convertView.getTag().asInstanceOf[ViewHolder]
    }
  }

  def getConvertViewTuple(convertView: View): (View, ViewHolder) = {
    if (convertView == null) {
      val view = View.inflate(c, R.layout.list_item_b, null)
      val imageView = view.findViewById(R.id.icon).asInstanceOf[ImageView]
      val titleView = view.findViewById(R.id.title).asInstanceOf[TextView]
      val messageView = view.findViewById(R.id.message).asInstanceOf[TextView]
      (view, new ViewHolder(imageView, titleView, messageView))
    } else {
      (convertView, convertView.getTag().asInstanceOf[ViewHolder])
    }
  }

  override def getView(i: Int, convertView: View,
                       viewGroup: ViewGroup): View = {
    val tuple = getConvertViewTuple(convertView)
    val view = tuple._1
    val holder: ViewHolder = tuple._2
    val message = getItem(i).asInstanceOf[Message]

    holder.imageView.setImageResource(R.mipmap.ic_launcher)
    holder.title.setText(message.title)
    holder.message.setText(message.message)
    view.setTag(holder)
    view
  }

  class ViewHolder(val imageView: ImageView, val title: TextView, val message: TextView)

}

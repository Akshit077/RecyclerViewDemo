package com.example.recyclerviewdemo

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyCustomViewHolder(item_view: View):RecyclerView.ViewHolder(item_view)
{
    val imageView=item_view.findViewById<ImageView>(R.id.img_view1)
    val textView1=item_view.findViewById<TextView>(R.id.tv1)
    val textView2=item_view.findViewById<TextView>(R.id.tv2)
    val ratingBar=item_view.findViewById<RatingBar>(R.id.rb1)
    val textView3=item_view.findViewById<TextView>(R.id.tv3)
    val textView4=item_view.findViewById<TextView>(R.id.tv4)
    val textView5=item_view.findViewById<TextView>(R.id.tv5)
}
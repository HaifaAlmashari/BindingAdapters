package com.example.bindingadapters

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load


@BindingAdapter("loadImageFromUrl", "displayTitle",requireAll = false)
fun ImageView.loadImageFromUrl(profilePhoto: String, title: String)
{
    this.load(profilePhoto)
    Log.d("Title", title)
}

@BindingAdapter("setVisibility")
fun View.setMyViewVisibility(points : Int)
{
    if(points > 10)
    {
        this.visibility = View.VISIBLE
    }
//    when(this)
//    {
//        is ImageView ->
//        {
//
//        }
//        is TextView ->
//        {
//
//        }
//    }

}

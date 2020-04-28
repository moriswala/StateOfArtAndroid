package com.rajesh.stateofartandroid.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.databinding.BindingAdapter
import androidx.palette.graphics.Palette
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.rajesh.stateofartandroid.R

fun getProgressDrawable(mContext: Context): CircularProgressDrawable {
    return CircularProgressDrawable(mContext).apply {
        strokeWidth = 10f
        centerRadius = 50f
        start()
    }
}


fun ImageView.loadImage(url: String?, progressDrawable: CircularProgressDrawable) {
    val options = RequestOptions().placeholder(progressDrawable).error(R.mipmap.ic_launcher_round)
    Glide.with(context).applyDefaultRequestOptions(options)
        .load(url)
        .into(this)
}


@BindingAdapter("android:imageUrl")
fun loadImage(view: ImageView, url: String?) {
    val options = RequestOptions().placeholder(getProgressDrawable(view.context.applicationContext))
        .error(R.mipmap.ic_launcher_round)
    Glide.with(view.context)
        .applyDefaultRequestOptions(options)
        .load(url)
        .into(view)
}

@BindingAdapter("android:bgColor")
fun setBackgroundColor(layout: LinearLayout, color: Int) {
    layout.setBackgroundColor(color)
}

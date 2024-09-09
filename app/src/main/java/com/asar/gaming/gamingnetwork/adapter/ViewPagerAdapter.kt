package com.asar.gaming.gamingnetwork.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val layouts: List<Int>, activity: AppCompatActivity) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(layouts[viewType], parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = layouts.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Do nothing, layouts are static
    }

    override fun getItemViewType(position: Int): Int = position
}
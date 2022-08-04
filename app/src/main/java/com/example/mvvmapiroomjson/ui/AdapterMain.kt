package com.example.mvvmapiroomjson.ui

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterMain():RecyclerView.Adapter<AdapterMain.ViewHolder>() {
    inner class ViewHolder(view:View) : RecyclerView.ViewHolder(view){
        view.bind
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        fun bind(holder){}

    }

    override fun getItemCount(): Int {
    }


}
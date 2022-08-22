package com.example.mvvmapiroomjson.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmapiroomjson.R
import com.example.mvvmapiroomjson.data.Data
import com.example.mvvmapiroomjson.databinding.ListItemBinding

class AdapterMain(private var mcontext:Context,private var data:ArrayList<Data>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class ViewHolder(view:ListItemBinding) : RecyclerView.ViewHolder(view.root){
        fun setData(data:Data){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.list_item,parent,false))
    }

    override fun getItemCount(): Int {
       return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).setData(data[position])
    }
}
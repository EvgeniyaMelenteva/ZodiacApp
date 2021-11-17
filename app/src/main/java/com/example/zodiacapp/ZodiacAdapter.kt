package com.example.zodiacapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ZodiacAdapter(private val zodiacList:List<Zodiac>): RecyclerView.Adapter<ZodiacViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZodiacViewHolder {
        val zodiacListItemView=
            LayoutInflater.from(parent.context)
                .inflate(R.layout.zodiac_list_item, parent, false)

        return  ZodiacViewHolder(zodiacListItemView)
    }

    override fun onBindViewHolder(holder: ZodiacViewHolder, position: Int) {
        val zodiac=zodiacList[position]
        holder.bind(zodiac)
    }

    override fun getItemCount(): Int {

        return zodiacList.size
    }
}
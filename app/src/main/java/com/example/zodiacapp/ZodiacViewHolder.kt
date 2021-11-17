package com.example.zodiacapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ZodiacViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(zodiac: Zodiac) {
        val titleTextView: TextView = itemView.findViewById(R.id.title_text_view)
        val datesTextView: TextView = itemView.findViewById(R.id.dates_text_view)
        val elementTextView: TextView = itemView.findViewById(R.id.element_text_view)

        titleTextView.text=zodiac.title
        datesTextView.text=zodiac.dates
        elementTextView.text=zodiac.element
    }
}
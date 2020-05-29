package com.example.template

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ModelAdapter(val models: List<Model>){
    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
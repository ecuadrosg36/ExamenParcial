package com.example.examenparcial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StadiumAdapter(private val stadiums: List<Stadium>) : RecyclerView.Adapter<StadiumAdapter.StadiumViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StadiumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_stadium, parent, false)
        return StadiumViewHolder(view)
    }

    override fun onBindViewHolder(holder: StadiumViewHolder, position: Int) {
        val stadium = stadiums[position]
        holder.bind(stadium)
    }

    override fun getItemCount(): Int = stadiums.size

    class StadiumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        private val locationTextView: TextView = itemView.findViewById(R.id.locationTextView)
        private val capacityTextView: TextView = itemView.findViewById(R.id.capacityTextView)

        fun bind(stadium: Stadium) {
            imageView.setImageResource(stadium.imageResId)
            nameTextView.text = stadium.name
            locationTextView.text = stadium.location
            capacityTextView.text = stadium.capacity
        }
    }
}

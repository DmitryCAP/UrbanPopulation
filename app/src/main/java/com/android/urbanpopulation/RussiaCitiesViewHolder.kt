package com.android.urbanpopulation

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RussiaCitiesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val cityTextView: TextView = itemView.findViewById(R.id.cities_name_view)
    private val populationTextView: TextView = itemView.findViewById(R.id.population_int_view)


    fun bind(city: RussiaCities) {


        cityTextView.text = "City - ${city.city}"
        populationTextView.text = "Population - Нажми для показа"
        itemView.setOnClickListener{
            Toast.makeText(itemView.context,city.population, Toast.LENGTH_SHORT).show()
        }
    }


}
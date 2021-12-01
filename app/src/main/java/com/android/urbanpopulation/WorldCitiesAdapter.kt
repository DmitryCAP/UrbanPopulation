package com.android.urbanpopulation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WorldCitiesAdapter(private val worldCitiesList: List<WorldCities>): RecyclerView.Adapter<WorldCitiesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorldCitiesViewHolder {

        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.world_cities_list_item, parent,false)

       return WorldCitiesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WorldCitiesViewHolder, position: Int) {
        val worldCities = worldCitiesList[position]
        holder.bind(worldCities)
    }

    override fun getItemCount(): Int {
        return worldCitiesList.size
    }
}
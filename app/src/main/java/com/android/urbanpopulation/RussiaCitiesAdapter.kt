package com.android.urbanpopulation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RussiaCitiesAdapter(private val russianCitiesList: List<RussiaCities>): RecyclerView.Adapter<RussiaCitiesViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RussiaCitiesViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.russia_cities_list_item, parent,false)

        return RussiaCitiesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RussiaCitiesViewHolder, position: Int) {
        val russiaCities = russianCitiesList[position]
        holder.bind(russiaCities)
    }

    override fun getItemCount(): Int {
        return russianCitiesList.size
    }
}
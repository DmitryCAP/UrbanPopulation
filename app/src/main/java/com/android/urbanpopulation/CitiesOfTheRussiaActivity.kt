package com.android.urbanpopulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CitiesOfTheRussiaActivity : AppCompatActivity() {

    lateinit var russiaCitiesRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cities_of_the_russia)

        val russiaCitiesList: List<RussiaCities> = listOf(
            RussiaCities("Москва", "12.6 mill."),
            RussiaCities("Санкт-петербург", "5.3 mill."),
            RussiaCities("Новосибирск", "1.6 mill."),
            RussiaCities("Екатеринбург", "1.5 mill."),
            RussiaCities("Нижний Новгород", "1.26 mill."),
            RussiaCities("Казань", "1.25 mill."),
            RussiaCities("Челябинск", "1.18 mill."),
            RussiaCities("Самара", "1.14 mill."),
            RussiaCities("Омск", "1.13 mill.")

        )

        russiaCitiesRecyclerView = findViewById(R.id.russia_cities_recycler_view)

        russiaCitiesRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        russiaCitiesRecyclerView.adapter = RussiaCitiesAdapter(russiaCitiesList)
        russiaCitiesRecyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }
}
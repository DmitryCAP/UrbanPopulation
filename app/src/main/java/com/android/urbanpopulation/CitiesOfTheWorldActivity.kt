package com.android.urbanpopulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CitiesOfTheWorldActivity : AppCompatActivity() {

    lateinit var worldCitiesRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cities_of_the_world)

        val worldCitiesList: List<WorldCities> = listOf(
        WorldCities("Шанхай(Китай)","23,4 млн."),
        WorldCities("Пекин(Китай)","21,2 млн."),
        WorldCities("Мумбаи(Индия)","15,4 млн."),
        WorldCities("Станбул(Турция)","15 млн."),
        WorldCities("Карачи(Пакистан)","14,9 млн."),
        WorldCities("Ганчжоу(Китай)","14 млн."),
        WorldCities("Токио(Япония)","14 млн."),
        WorldCities("Лагос(Нигерия)","13,7 млн."),
        WorldCities("Тяньцзинь(Китай)","13,3 млн."),
        WorldCities("Москва(Россия)","12,7 млн.")
        )
        worldCitiesRecyclerView = findViewById(R.id.world_cities_recycler_view)

        worldCitiesRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

            worldCitiesRecyclerView.adapter = WorldCitiesAdapter(worldCitiesList)
        worldCitiesRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )

    }
}
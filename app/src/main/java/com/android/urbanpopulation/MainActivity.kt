package com.android.urbanpopulation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var worldActivityButton:Button




    lateinit var russiaActivityButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        worldActivityButton = findViewById(R.id.world_button)

        worldActivityButton.setOnClickListener{
            val worldActivityIntent: Intent = Intent(this, CitiesOfTheWorldActivity::class.java)
            startActivity(worldActivityIntent)
        }



        russiaActivityButton = findViewById(R.id.russia_button)

        russiaActivityButton.setOnClickListener{
            val russiaActivityIntent: Intent = Intent(this, CitiesOfTheRussiaActivity::class.java)
            startActivity(russiaActivityIntent)
        }


    }
}
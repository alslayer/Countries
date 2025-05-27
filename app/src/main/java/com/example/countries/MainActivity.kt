package com.example.countries

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        CountriesApi().getCountries().enqueue(object: Callback<Countries> {
            override fun onFailure(call: Call<Countries>, t: Throwable) {
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                println("Error: " + t.message)
            }

            override fun onResponse(call: Call<Countries>, response: Response<Countries>) {
                val countries = response.body()
                countries?.let {
                    showCountries(it)
                }
            }
        })
    }

    private fun showCountries(countriesResponse: Countries) {
        val recyclerViewMovies = findViewById<RecyclerView>(R.id.recyclerViewCountires)
        recyclerViewMovies.layoutManager = LinearLayoutManager(this)
        recyclerViewMovies.adapter = CountriesAdapter(countriesResponse)
    }

}
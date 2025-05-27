package com.example.countries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountriesAdapter(val countries : Countries) : RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        return CountryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.text_row_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        println("Countries size: " + countries.size)
        return countries.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]
        holder.view.findViewById<TextView>(R.id.countryNameTextview).text = "${country.name}, ${country.region}"
        holder.view.findViewById<TextView>(R.id.countryCodeTextview).text = country.code
        holder.view.findViewById<TextView>(R.id.countryCapitalTextview).text = country.capital
    }

    class CountryViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
package com.example.countries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CountriesAdapter(val countires : List<Country>) : RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        return CountryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.text_row_item, parent, false)
        )
    }

    override fun getItemCount() = countires.size

    override fun onBindViewHolder(holder: CountriesAdapter.CountryViewHolder, position: Int) {
        val country = countires[position]
//        holder.view..countryNameTextview.text = "${country.name}, ${country.region}"
//        holder.view..countryCodeTextview.text = country.code
//        holder.view..countryCapitalTextview.text = country.capital
    }

    class CountryViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
package com.example.countries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.AnyRes
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonCancellable.parent


class CountriesAdapter(val countries : Any) : RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>() {

    var countryNameTextview: TextView? = null
    var countryCodeTextview: TextView? = null
    var countryCapitalTextview: TextView? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        countryNameTextview = parent.findViewById<TextView>(R.id.countryNameTextview)
        countryCodeTextview = parent.findViewById<TextView>(R.id.countryCodeTextview)
        countryCapitalTextview = parent.findViewById<TextView>(R.id.countryCapitalTextview)

        return CountryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.text_row_item, parent, false)
        )

    }

    override fun getItemCount(): Int {
        println("Countries size: " + countries)
        return 3
    }


//    override fun getItemCount() = countires

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
//        val country = countires[position]

//        val countryNameTextview = this.countires.findvierecyclerViewCountires

//        holder.view.countryNameTextview.text = "${country.name}, ${country.region}"
//        holder.view.countryCodeTextview.text = country.code
//        holder.itemView.id.
//        countryCapitalTextview?.text = country.get(position).name
        holder.view.findViewById<TextView>(R.id.countryNameTextview).text = countries.toString()

//        countryCapitalTextview?.text = "Howdy"
    }

    class CountryViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
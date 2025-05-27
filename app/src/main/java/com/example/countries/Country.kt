package com.example.countries

//class Countries : Any()
class Countries : ArrayList<Country>()

data class Country(
    val capital: String,
    val code: String,
    val currency: Currency,
    val demonym: String,
    val flag: String,
    val language: Language,
    val name: String,
    val region: String
)

data class Currency(
    val code: String,
    val name: String,
    val symbol: String
)

data class Language(
    val code: String,
    val iso639_2: String,
    val name: String,
    val nativeName: String
)

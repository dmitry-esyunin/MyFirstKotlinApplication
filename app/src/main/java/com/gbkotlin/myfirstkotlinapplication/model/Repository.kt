package com.gbkotlin.myfirstkotlinapplication.model

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}
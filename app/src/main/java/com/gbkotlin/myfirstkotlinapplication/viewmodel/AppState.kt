package com.gbkotlin.myfirstkotlinapplication.viewmodel

import com.gbkotlin.myfirstkotlinapplication.model.Weather

sealed class AppState {
    data class Success(val weatherData : Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
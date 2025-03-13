package com.samaxz.horoscapp.data

import android.util.Log
import com.samaxz.horoscapp.data.network.HoroscopeApiService
import com.samaxz.horoscapp.domain.Repository
import com.samaxz.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        //Retrofit
        runCatching { // Execute a interface
            apiService.getHoroscope(sign)
        }
            .onSuccess { response ->
                return response.toDomain()
            }
            .onFailure {
                Log.i("SUPERSAMA", "ERROR: ${it.message}")
            }
        return null
    }
}
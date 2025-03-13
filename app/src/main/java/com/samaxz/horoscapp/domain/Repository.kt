package com.samaxz.horoscapp.domain

import com.samaxz.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}
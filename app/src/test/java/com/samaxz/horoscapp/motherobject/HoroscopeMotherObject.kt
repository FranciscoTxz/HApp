package com.samaxz.horoscapp.motherobject

import com.samaxz.horoscapp.data.network.response.PredictionResponse
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Aries
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Leo
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Libra
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.samaxz.horoscapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {
    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}
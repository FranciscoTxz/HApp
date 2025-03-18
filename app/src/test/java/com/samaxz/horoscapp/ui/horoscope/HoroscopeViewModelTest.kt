package com.samaxz.horoscapp.ui.horoscope

import com.samaxz.horoscapp.data.providers.HoroscopeProvider
import com.samaxz.horoscapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest {
    private lateinit var viewModel: HoroscopeViewModel

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewModel is created the horoscopes are loaded`() {
        every { horoscopeProvider.getHoroscopes() } returns horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())
    }
}
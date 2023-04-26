package com.master.horoscopoapp.core

import com.master.horoscopoapp.data.Network.HoroscopoApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Provides
    @Singleton
    fun providerRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl("POST: https://aztro.sameerkumar.website")
            .addConverterFactory(
            GsonConverterFactory.create())
            .build()
    }

    @Provides

    fun provideHoroscopoApi(retrofit: Retrofit) : HoroscopoApi {

        return retrofit.create(HoroscopoApi::class.java)
    }

}
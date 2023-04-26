package com.master.horoscopoapp.data.Network

import com.master.horoscopoapp.data.Network.Model.HoroscopoResponse
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface HoroscopoApi {


    @POST(".")

    suspend fun getHoroscopo(

        @Query("sign") sign: String,
        @Query("day") day: String
    ) : Response<HoroscopoResponse>

    }


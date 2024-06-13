package com.example.myapinumber.api

import com.example.myapinumber.api.dto.ActivityData
import retrofit2.http.GET

interface ApiService {
    @GET("api/activity")
    suspend fun getActivity(): ActivityData
}

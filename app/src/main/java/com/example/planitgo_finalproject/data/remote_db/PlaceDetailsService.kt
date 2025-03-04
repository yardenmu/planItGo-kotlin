package com.example.planitgo_finalproject.data.remote_db

import com.example.planitgo_finalproject.BuildConfig
import com.example.planitgo_finalproject.data.models.PlacesDetailsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceDetailsService {
    @GET("place/details/json")
    suspend fun getPlaceDetails(
        @Query("place_id") placeId: String,
        @Query("fields") fields: String = "opening_hours,editorial_summary",
        @Query("language") language: String,
        @Query("key") apiKey: String = BuildConfig.PLACES_API_KEY,
    ): Response<PlacesDetailsResponse>
}
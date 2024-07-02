package com.hijin.network

import com.hijin.data.model.AnnouncementResponse
import retrofit2.http.GET

interface AuthService {
    @GET("announcement")
    suspend fun getAnnouncement(): AnnouncementResponse

}
package com.hijin.data.service

import com.hijin.data.api.dto.LoginResponse
import retrofit2.http.GET

interface AuthService {
    @GET("announcement")
    suspend fun logIn(): LoginResponse

}
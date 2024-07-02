package com.hijin.data.repositoryImpl

import com.hijin.data.model.AnnouncementResponse
import com.hijin.domain.ApiResult
import com.hijin.domain.repository.AuthRepository
import com.hijin.network.AuthService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Retrofit
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    retrofit: Retrofit,
) : AuthRepository {
    private val authService = retrofit.create(AuthService::class.java)

    override suspend fun getAnnouncement(): Flow<ApiResult<AnnouncementResponse>> = flow {
        emit(authService.getAnnouncement())
    }

}

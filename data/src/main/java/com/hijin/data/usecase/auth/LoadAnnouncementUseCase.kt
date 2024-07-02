package com.hijin.data.usecase.auth

import com.hijin.data.model.AnnouncementResponse
import com.hijin.domain.ApiResult
import com.hijin.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoadAnnouncementUseCase @Inject constructor(
    private val authRepository: AuthRepository){
    suspend operator fun invoke(): Flow<ApiResult<AnnouncementResponse>> =
        authRepository.getAnnouncement()
}

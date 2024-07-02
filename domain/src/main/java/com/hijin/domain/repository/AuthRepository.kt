package com.hijin.domain.repository

import com.hijin.data.model.AnnouncementResponse
import com.hijin.domain.ApiResult
import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    suspend fun getAnnouncement(): Flow<ApiResult<AnnouncementResponse>>

}

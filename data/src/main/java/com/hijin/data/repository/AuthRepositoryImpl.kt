package com.hijin.data.repository

import kotlinx.coroutines.flow.Flow

class AuthRepositoryImpl @Inject constructor(
//    @ForSoomsilPublicAPI soomsilRetrofit: Retrofit,
) : AnnouncementRepository {
    private val announcementService = soomsilRetrofit.create(AnnouncementService::class.java)

    override suspend fun getAnnouncement(): Flow<ApiResult<AnnouncementResponse>> = handleFlowApi {
        announcementService.getAnnouncement()
    }

}

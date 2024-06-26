package com.hijin.data.usecase.auth

import kotlinx.coroutines.flow.Flow

class LoginUsecase @Inject constructor(
    private val authRepository: AuthRepository,
) {
    suspend operator fun invoke(session: String): Flow<ApiResult<CheckVerifiedEmailResponse>> =
        authRepository.getEmailVerifiedCheck(session)
}

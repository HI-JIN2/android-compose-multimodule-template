package com.hijin.data.repositoryImpl

import com.hijin.data.api.dto.LoginResponse
import com.hijin.data.mapper.toDomain
import com.hijin.data.service.AuthService
import com.hijin.domain.model.User
import com.hijin.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Retrofit
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authService: AuthService
) : AuthRepository {

    override suspend fun logIn(): User {
        val userDto = authService.logIn()
        return userDto.toDomain() // 확장 함수 사용
    }
}

package com.hijin.domain.usecase.auth


import com.hijin.domain.model.User
import com.hijin.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class LoginUsecase @Inject constructor(
    private val authRepository: AuthRepository){
    suspend operator fun invoke(): User =
        authRepository.logIn()
}

package com.hijin.domain.repository

import com.hijin.domain.model.User

//import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    suspend fun logIn(): User

}

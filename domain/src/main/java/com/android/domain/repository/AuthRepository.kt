package com.android.domain.repository

import com.android.domain.model.User

//import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    suspend fun logIn(): User

}

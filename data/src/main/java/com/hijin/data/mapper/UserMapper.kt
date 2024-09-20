package com.hijin.data.mapper

import com.hijin.data.api.dto.LoginResponse
import com.hijin.domain.model.User

// UserDto를 User로 변환하는 확장 함수
fun LoginResponse.toDomain(): User {
    return User(
        id = this.id,
        name = this.fullName,
        email = this.emailAddress
    )
}

// User를 UserDto로 변환하는 확장 함수
fun User.toDto(): LoginResponse {
    return LoginResponse(
        id = this.id,
        fullName = this.name,
        emailAddress = this.email
    )
}
package com.myworkout.shared.app.usecases

import com.myworkout.shared.app.data.repositories.token.TokenRepository
import com.myworkout.shared.app.data.services.AuthenticationService
import com.myworkout.shared.domain.core.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LoginUseCase(
    private val authenticationService: AuthenticationService,
    private val tokenRepository: TokenRepository
) : UseCase<LoginUseCase.LoginUseCaseInput, Boolean> {

    override suspend fun invoke(t: LoginUseCaseInput): Flow<Boolean> {
        val response = authenticationService.authenticate(t.userName, t.password)

        if (response is Response.Success) {
            tokenRepository.token = response.result
        }

        return flow { emit(response is Response.Success) }
    }

    data class LoginUseCaseInput(
        val userName: String,
        val password: String
    )
}
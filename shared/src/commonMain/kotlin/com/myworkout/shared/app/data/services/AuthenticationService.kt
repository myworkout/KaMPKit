package com.myworkout.shared.app.data.services

import com.myworkout.kotlin.api.apis.AuthApi
import com.myworkout.shared.domain.core.Response

interface AuthenticationService {

    suspend fun authenticate(userName: String, password: String): Response<String>
}

class AuthenticationServiceImpl(
    private val apiService: ApiService
) : AuthenticationService {

    private val authApi: AuthApi by lazy {
        apiService.createAuthApi()
    }

    override suspend fun authenticate(userName: String, password: String): Response<String> {
        return try {
            val tokenResponse = authApi.login(userName, password)
            val token = tokenResponse.body().data?.jwt

            // very basic error handling here, but since it's a prototype ...
            if (token.isNullOrEmpty()) {
                Response.Failure(reason = Response.FailureReason.UNKNOWN)
            } else {
                Response.Success(token)
            }
        } catch (t: Throwable) {
            Response.Failure(reason = Response.FailureReason.UNKNOWN)
        }
    }
}

package com.myworkout.shared.app.data.services

import com.myworkout.kotlin.api.apis.AuthApi
import kotlinx.serialization.json.Json

interface ApiService {
    fun createAuthApi(): AuthApi
}

class ApiServiceImpl : ApiService {

    private val json: Json by lazy {
        Json(builderAction = {})
    }

    override fun createAuthApi(): AuthApi = AuthApi(jsonSerializer = json)
}

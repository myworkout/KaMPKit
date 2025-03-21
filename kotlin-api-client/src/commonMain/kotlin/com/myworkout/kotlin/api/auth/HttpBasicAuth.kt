package com.myworkout.kotlin.api.auth

import io.ktor.util.InternalAPI
import io.ktor.util.encodeBase64

class HttpBasicAuth : Authentication {
    var username: String? = null
    var password: String? = null

    @InternalAPI
    override fun apply(query: MutableMap<String, List<String>>, headers: MutableMap<String, String>) {
        if (username == null && password == null) return
        val str = (username ?: "") + ":" + (password ?: "")
        val auth = str.encodeBase64()
        headers["Authorization"] = "Basic $auth"
    }
}

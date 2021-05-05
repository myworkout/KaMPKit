package com.myworkout.shared.app.data.repositories.token

interface TokenRepository {

    var token: String?
}

class InMemoryTokenRepository: TokenRepository {

    override var token: String? = null

    companion object {
        val shared: TokenRepository = InMemoryTokenRepository()
    }
}
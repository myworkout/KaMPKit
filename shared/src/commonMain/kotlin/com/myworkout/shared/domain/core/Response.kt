package com.myworkout.shared.domain.core

sealed class Response<T> {
    data class Success<T>(val result: T): Response<T>()
    data class Failure<T>(val reason: FailureReason): Response<T>()

    enum class FailureReason {
        UNKNOWN
    }
}
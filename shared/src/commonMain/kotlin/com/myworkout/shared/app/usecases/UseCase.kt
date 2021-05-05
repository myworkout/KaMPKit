package com.myworkout.shared.app.usecases

import kotlinx.coroutines.flow.Flow

interface UseCase<T, U> {

    suspend fun invoke(t: T): Flow<U>
}
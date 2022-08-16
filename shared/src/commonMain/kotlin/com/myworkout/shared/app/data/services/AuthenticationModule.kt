package com.myworkout.shared.app.data.services

import com.myworkout.shared.app.usecases.LoginUseCase
import org.koin.dsl.module

val authenticationModule = module {
    single {
        LoginUseCase(get(), get())
    }
}

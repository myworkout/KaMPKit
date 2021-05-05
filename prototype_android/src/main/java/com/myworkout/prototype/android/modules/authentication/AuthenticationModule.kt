package com.myworkout.prototype.android.modules.authentication

import com.myworkout.shared.app.usecases.LoginUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val authenticationModule = module {
    single {
        LoginUseCase(get(), get())
    }
    viewModel {
        LoginViewModel(get())
    }
}

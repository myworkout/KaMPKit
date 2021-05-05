package com.myworkout.shared

import co.touchlab.kermit.Kermit
import com.myworkout.shared.app.data.repositories.token.InMemoryTokenRepository
import com.myworkout.shared.app.data.repositories.token.TokenRepository
import com.myworkout.shared.app.data.services.ApiService
import com.myworkout.shared.app.data.services.ApiServiceImpl
import com.myworkout.shared.app.data.services.AuthenticationService
import com.myworkout.shared.app.data.services.AuthenticationServiceImpl
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

fun initKoin(vararg appModules: Module): KoinApplication {
    val koinApplication = startKoin {
        modules(
            *appModules,
            platformModule,
            coreModule
        )
    }

    val koin = koinApplication.koin
    val doOnStartup = koin.get<() -> Unit>()
    doOnStartup.invoke()

    val kermit = koin.get<Kermit> { parametersOf(null) }
    val appInfo = koin.get<AppInfo>()
    kermit.v { "App Id ${appInfo.appId}" }

    return koinApplication
}

private val coreModule = module {
    single<TokenRepository> {
        InMemoryTokenRepository()
    }
    single<AuthenticationService> {
        AuthenticationServiceImpl(get())
    }
    single<ApiService> {
        ApiServiceImpl()
    }
}

expect val platformModule: Module

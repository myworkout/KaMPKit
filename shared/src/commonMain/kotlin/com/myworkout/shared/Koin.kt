package com.myworkout.shared

import co.touchlab.kermit.Kermit
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

fun initKoin(appModule: Module): KoinApplication {
    val koinApplication = startKoin {
        modules(
            appModule,
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
}

expect val platformModule: Module

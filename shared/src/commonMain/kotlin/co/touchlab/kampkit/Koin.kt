package co.touchlab.kampkit

import co.touchlab.kampkit.ktor.DogApiImpl
import co.touchlab.kampkit.ktor.KtorApi
import kotlinx.coroutines.Dispatchers
import kotlinx.datetime.Clock
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

fun initKoin(appModule: Module): KoinApplication {
    val koinApplication = startKoin {
        modules(
            appModule,
            platformModule,
            coreModule
        )
    }

    // Dummy initialization logic, making use of appModule declarations for demonstration purposes.
    val koin = koinApplication.koin
    val doOnStartup = koin.get<() -> Unit>() // doOnStartup is a lambda which is implemented in Swift on iOS side
    doOnStartup.invoke()

    return koinApplication
}

private val coreModule = module {
    single {
        DatabaseHelper(
            get(),
            Dispatchers.Default
        )
    }
    single<KtorApi> {
        DogApiImpl()
    }
    single<Clock> {
        Clock.System
    }
}

expect val platformModule: Module

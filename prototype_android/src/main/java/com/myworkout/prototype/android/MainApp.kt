package com.myworkout.prototype.android

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.myworkout.prototype.android.modules.authentication.authenticationModule
import com.myworkout.shared.AppInfo
import com.myworkout.shared.initKoin
import org.koin.dsl.module

class MainApp : Application() {

    private val appModule = module {
        single<Context> { this@MainApp }
        single<SharedPreferences> {
            get<Context>().getSharedPreferences("PROTOTYPE_SETTINGS", Context.MODE_PRIVATE)
        }
        single<AppInfo> { AndroidAppInfo }
        single {
            { Log.i("Startup", "Hello from Android/Kotlin!") }
        }
    }

    override fun onCreate() {
        super.onCreate()
        initKoin(
            appModule,
            authenticationModule
        )
    }
}

object AndroidAppInfo : AppInfo {
    override val appId: String = BuildConfig.APPLICATION_ID
}

package co.touchlab.kampkit

import android.app.Application
import android.content.Context
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import org.koin.test.category.CheckModuleTest
import kotlin.test.AfterTest
import kotlin.test.Test

@RunWith(AndroidJUnit4::class)
@Category(CheckModuleTest::class)
class KoinTest : BaseTest() {

    @Test
    fun checkAllModules() {
        initKoin(
            module {
                single<Context> { getApplicationContext<Application>() }
                single { get<Context>().getSharedPreferences("TEST", Context.MODE_PRIVATE) }
                single<AppInfo> { TestAppInfo }
                single { {} }
            }
        )
    }

    @AfterTest
    fun breakdown() {
        stopKoin()
    }
}

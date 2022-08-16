package co.touchlab.kampkit

import org.koin.core.context.stopKoin
import platform.Foundation.NSUserDefaults
import kotlin.test.AfterTest
import kotlin.test.Test

class KoinTest : BaseTest() {
    @Test
    fun checkAllModules() {
        initKoinIos(
            userDefaults = NSUserDefaults.standardUserDefaults,
            appInfo = TestAppInfo,
            doOnStartup = { }
        )
    }

    @AfterTest
    fun breakdown() {
        stopKoin()
    }
}

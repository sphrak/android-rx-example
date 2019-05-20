package tld.example.app.android

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import timber.log.Timber
import tld.example.app.android.di.CoreComponent
import tld.example.app.android.di.DaggerCoreComponent
import tld.example.app.android.di.modules.ContextModule

class ExampleApplication : Application() {

    val cmp: CoreComponent by lazy(LazyThreadSafetyMode.NONE) {
        DaggerCoreComponent
            .builder()
            .contextModule(ContextModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        cmp.inject(this)
        plantTimber()
        initThreeTenAbp()
    }

    private fun initThreeTenAbp() {
        AndroidThreeTen.init(this)
    }

    private fun plantTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}
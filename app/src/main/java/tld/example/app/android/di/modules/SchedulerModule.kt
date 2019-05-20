package tld.example.app.android.di.modules

import dagger.Module
import dagger.Provides
import tld.example.app.android.common.Schedulers
import tld.example.app.android.di.CoreScope

@Module
object SchedulerModule {
    @Provides
    @JvmStatic
    @CoreScope
    fun provideSchedulers(): Schedulers = Schedulers()
}
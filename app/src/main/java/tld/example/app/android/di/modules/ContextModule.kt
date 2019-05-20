package tld.example.app.android.di.modules

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import tld.example.app.android.di.CoreScope

@Module
class ContextModule(private val application: Application) {

    @Provides
    @CoreScope
    fun provideContext(): Context = application
}
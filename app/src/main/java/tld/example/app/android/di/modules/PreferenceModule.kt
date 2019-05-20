package tld.example.app.android.di.modules

import android.content.Context
import com.afollestad.rxkprefs.RxkPrefs
import com.afollestad.rxkprefs.rxkPrefs
import dagger.Module
import dagger.Provides
import tld.example.app.android.di.CoreScope

@Module(
    includes = [
        ContextModule::class
    ]
)
object PreferenceModule {

    const val PREFS_NAME = "tld.example.app.android"

    @Provides
    @JvmStatic
    @CoreScope
    fun provideRxkPrefs(context: Context): RxkPrefs = rxkPrefs(context, PREFS_NAME)
}
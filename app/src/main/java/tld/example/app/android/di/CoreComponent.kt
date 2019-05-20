package tld.example.app.android.di

import android.app.Application
import com.afollestad.rxkprefs.RxkPrefs
import dagger.Component
import tld.example.app.android.di.modules.PreferenceModule
import tld.example.app.android.di.modules.SchedulerModule
import tld.example.app.android.presentation.main.di.MainActivityComponent
import tld.example.app.android.presentation.widget.provider.di.WidgetProviderComponent
import tld.example.app.android.presentation.widget.setup.di.WidgetSetupComponent

@CoreScope
@Component(
    modules = [
        PreferenceModule::class,
        SchedulerModule::class
    ]
)
interface CoreComponent {

    fun inject(application: Application)

    fun rxkPrefs(rxkPrefs: RxkPrefs)

    fun mainActivityComponentBuilder(): MainActivityComponent.Builder
    fun widgetSetupComponentBuilder(): WidgetSetupComponent.Builder
    fun widgetProviderComponentBuilder(): WidgetProviderComponent.Builder

}
package tld.example.app.android.presentation.widget.setup.di

import dagger.Subcomponent
import tld.example.app.android.presentation.widget.setup.WidgetSetup

@Subcomponent(
    modules = [
        WidgetSetupModule::class
    ]
)
@WidgetSetupScope
interface WidgetSetupComponent {

    fun inject(widgetSetup: WidgetSetup)

    @Subcomponent.Builder
    interface Builder {
        fun widgetSetupModule(module: WidgetSetupModule): Builder
        fun build(): WidgetSetupComponent
    }
}
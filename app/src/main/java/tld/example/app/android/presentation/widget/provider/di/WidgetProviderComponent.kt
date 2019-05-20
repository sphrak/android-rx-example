package tld.example.app.android.presentation.widget.provider.di

import dagger.Subcomponent
import tld.example.app.android.presentation.widget.provider.WidgetProvider

@Subcomponent(
    modules = [
        WidgetProviderModule::class
    ]
)
@WidgetProviderScope
interface WidgetProviderComponent {

    fun inject(widgetProvider: WidgetProvider)

    @Subcomponent.Builder
    interface Builder {
        fun widgetProviderModule(module: WidgetProviderModule): Builder
        fun build(): WidgetProviderComponent
    }
}
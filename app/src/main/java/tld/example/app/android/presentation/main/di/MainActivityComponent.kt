package tld.example.app.android.presentation.main.di

import dagger.Subcomponent
import tld.example.app.android.presentation.main.MainActivity

@Subcomponent(
    modules = [
        MainActivityModule::class
    ]
)
@MainActivityScope
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun mainActivityModule(module: MainActivityModule): Builder
        fun build(): MainActivityComponent
    }
}
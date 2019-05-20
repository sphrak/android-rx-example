package tld.example.app.android.presentation.main.di

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject
import tld.example.app.android.presentation.main.MainActivityView

@Module
object MainActivityModule {

    @Provides
    @JvmStatic
    @MainActivityScope
    fun provideViewState(): MainActivityView.State = MainActivityView.State()

    @Provides
    @JvmStatic
    @MainActivityScope
    fun provideOnViewInitialisedSubject(): PublishSubject<MainActivityView.Event.OnInitialised> =
        PublishSubject.create()

    @Provides
    @JvmStatic
    @MainActivityScope
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()
}
package tld.example.app.android.presentation.widget.provider.di

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject
import tld.example.app.android.presentation.widget.provider.WidgetProviderView

@Module
object WidgetProviderModule {

    @Provides
    @JvmStatic
    @WidgetProviderScope
    fun provideViewState(): WidgetProviderView.State = WidgetProviderView.State()

    @Provides
    @JvmStatic
    @WidgetProviderScope
    fun provideOnViewInitialisedSubject(): PublishSubject<WidgetProviderView.Event.OnViewInitialised> =
        PublishSubject.create()

    @Provides
    @JvmStatic
    @WidgetProviderScope
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()
}
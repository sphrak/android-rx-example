package tld.example.app.android.presentation.widget.setup.di

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject
import tld.example.app.android.presentation.widget.setup.WidgetSetupView


@Module
object WidgetSetupModule {

    @Provides
    @JvmStatic
    @WidgetSetupScope
    fun provideViewState(): WidgetSetupView.State = WidgetSetupView.State()

    @Provides
    @JvmStatic
    @WidgetSetupScope
    fun provideOnViewInitialisedSubject(): PublishSubject<WidgetSetupView.Event.OnViewInitialised> =
        PublishSubject.create()

    @Provides
    @JvmStatic
    @WidgetSetupScope
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()
}


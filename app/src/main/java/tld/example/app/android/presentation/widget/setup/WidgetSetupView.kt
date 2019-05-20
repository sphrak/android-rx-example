package tld.example.app.android.presentation.widget.setup

object WidgetSetupView {

    sealed class Event {
        object OnViewInitialised : Event()
    }

    data class State(
        val renderEvent: RenderEvent = RenderEvent.None
    )

    sealed class RenderEvent {
        object None : RenderEvent()
    }

}
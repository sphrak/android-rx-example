package tld.example.app.android.presentation.main

object MainActivityView {

    sealed class Event {
        object OnInitialised : Event()
    }

    data class State(
        val renderEvent: RenderEvent = RenderEvent.None
    )

    sealed class RenderEvent {
        object None: RenderEvent()
    }
}
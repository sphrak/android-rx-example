package tld.example.app.android.presentation.main

import tld.example.app.android.domain.keyvalue.GetKeyValueTask
import tld.example.app.android.domain.keyvalue.SetKeyValueTask
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val state: MainActivityView.State,
    private val getKeyValueTask: GetKeyValueTask
) {

    /**
     *  Load the initial value stored in randomNumber prefs
     */
    operator fun invoke() {

    }
}
package tld.example.app.android.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.disposables.CompositeDisposable
import tld.example.app.android.R
import tld.example.app.android.common.Schedulers
import tld.example.app.android.presentation.main.di.MainActivityScope
import javax.inject.Inject

@MainActivityScope
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var subscriptions: CompositeDisposable

    /*@Inject
    lateinit var schedulers: Schedulers*/

    @Inject
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

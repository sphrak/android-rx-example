package tld.example.app.android.data.keyvalue

import com.afollestad.rxkprefs.Pref
import com.afollestad.rxkprefs.RxkPrefs
import io.reactivex.Single
import tld.example.app.android.data.exception.Failure
import tld.example.app.android.data.functional.Either
import javax.inject.Inject

class KeyValueLocalDataSource @Inject constructor(
    rxkprefs: RxkPrefs
) {
    private companion object {
        const val RANDOM_NUMBER_KEY = "RANDOM_NUMBER"
        const val DEFAULT_NUMBER = -1
    }

    private val randomNumber: Pref<Int> = rxkprefs.integer(RANDOM_NUMBER_KEY, DEFAULT_NUMBER)

    fun putInt(key: String, value: Int): Single<Either<Failure, Unit>> =
        when (key) {
            RANDOM_NUMBER_KEY -> Single.fromCallable {
                Either.Right(
                    randomNumber
                        .set(value)
                )
            }
            else -> Single.just(
                Either.Left(Failure.Error)
            )
        }

    fun getInt(key: String): Single<Either<Failure, Int>> = when (key) {
        RANDOM_NUMBER_KEY -> Single.fromCallable {
            Either.Right(
                randomNumber.get()
            )
        }
        else -> Single.just(
            Either.Left(Failure.Error)
        )
    }

}
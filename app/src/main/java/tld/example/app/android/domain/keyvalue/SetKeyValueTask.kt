package tld.example.app.android.domain.keyvalue

import io.reactivex.Single
import tld.example.app.android.data.exception.Failure
import tld.example.app.android.data.functional.Either
import tld.example.app.android.data.keyvalue.KeyValueLocalDataSource
import javax.inject.Inject

class SetKeyValueTask @Inject constructor(
    private val local: KeyValueLocalDataSource
) {
    operator fun invoke(key: String, value: Int): Single<Either<Failure, Unit>> =
        local.putInt(key, value)
}
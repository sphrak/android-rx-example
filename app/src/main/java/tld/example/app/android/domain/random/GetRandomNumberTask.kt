package tld.example.app.android.domain.keyvalue.random

import io.reactivex.Single
import tld.example.app.android.data.exception.Failure
import tld.example.app.android.data.functional.Either
import tld.example.app.android.data.random.RandomNumberRepository
import javax.inject.Inject

class GetRandomNumberTask @Inject constructor(
    private val repo: RandomNumberRepository
) {

    /**
     *  Returns a random number
     */
    operator fun invoke(): Single<Either<Failure, Int>> =
        repo()
}
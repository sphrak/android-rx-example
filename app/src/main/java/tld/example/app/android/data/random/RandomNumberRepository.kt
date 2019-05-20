package tld.example.app.android.data.random

import io.reactivex.Single
import tld.example.app.android.data.exception.Failure
import tld.example.app.android.data.functional.Either
import kotlin.random.Random

class RandomNumberRepository {

    private companion object {
        const val MIN = 1024
        const val MAX = 4096
    }

    /**
     *  Returns a random number in range [MIN], [MAX]
     */
    operator fun invoke(): Single<Either<Failure, Int>> =
        Single.just(
            Either.Right(
                Random.nextInt(MIN, MAX)
            )
        )
}
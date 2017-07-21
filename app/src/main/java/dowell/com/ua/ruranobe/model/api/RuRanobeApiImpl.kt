package dowell.com.ua.ruranobe.model.api

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import timber.log.Timber

/**
 * Created by kosty on 7/21/2017.
 */
object RuRanobeApiImpl {

    private val BASE_URL = "http://api.novel.tl/"
    fun createApi(): RuRanobeApi = Retrofit.Builder()
            .client(createClient())
            .baseUrl(BASE_URL)
            .build()
            .create(RuRanobeApi::class.java)

    private fun createClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
                .addInterceptor(createLogInterceptor())
        return builder.build()
    }

    private fun createLogInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor({ Timber.tag("ruRanobe").d(it) })
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }
}


package store.newstep.newstepstore.retrofit

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import store.newstep.newstepstore.model.Color
import store.newstep.newstepstore.model.GetBodyResponse

/**
 * Created by wyacheslav on 13.03.18.
 * АПИ сервера
 */
interface NewstepStoreServiceAPI {

    @GET("colors/top")
    fun getTopColors(): Call<GetBodyResponse<Color>>

    /**
     * Companion object to create the NewstepStoreServiceAPI
     */
    companion object Factory {
        /**
         * URL
         */
        private val baseURL: String = "http://test-api-shop.abo-soft.com/"

        /**
         * Фабричный метод
         */
        fun create(): NewstepStoreServiceAPI = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseURL)
                .build().create(NewstepStoreServiceAPI::class.java)
    }
}
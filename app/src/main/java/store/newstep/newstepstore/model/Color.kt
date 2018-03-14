package store.newstep.newstepstore.model

import com.google.gson.annotations.SerializedName

/**
 * Created by wyacheslav on 27.02.18.
 * Цвет
 * TODO убрать дефолтные значения из конструктора
 */
data class Color(
        @SerializedName("id")
        val id: Int = 1,
        @SerializedName("name")
        val name: String = "name",
        @SerializedName("isSale")
        val isSale: Boolean = true,
        @SerializedName("oldPrice")
        val oldPrice: Int = 200,
        @SerializedName("price")
        val price: Int = 100,
        @SerializedName("img")
        val img: String = "http://test-api-shop.abo-soft.com/files/thumb/ef2eb797ff61129c1adcbff96221a80b.jpeg",
        @SerializedName("product")
        val product: Product = Product())
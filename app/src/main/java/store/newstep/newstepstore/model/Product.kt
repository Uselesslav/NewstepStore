package store.newstep.newstepstore.model

import com.google.gson.annotations.SerializedName

/**
 * Created by wyacheslav on 27.02.18.
 * Товар
 * TODO убрать дефолтные значения из конструктора
 */
data class Product(
        @SerializedName("id")
        val id: Int = 1,
        @SerializedName("name")
        val name: String = "name",
        @SerializedName("description")
        val description: String = "description",
        @SerializedName("img")
        val img: String = "http://test-api-shop.abo-soft.com/files/slider_detail/ef2eb797ff61129c1adcbff96221a80b.jpeg",
        @SerializedName("category")
        val category: Category = Category())
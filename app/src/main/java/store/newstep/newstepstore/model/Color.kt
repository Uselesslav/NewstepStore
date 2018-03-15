package store.newstep.newstepstore.model

import com.google.gson.annotations.SerializedName

/**
 * Created by wyacheslav on 27.02.18.
 * Цвет
 */
data class Color(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("isSale")
        val isSale: Boolean,
        @SerializedName("oldPrice")
        val oldPrice: Int,
        @SerializedName("price")
        val price: Int,
        @SerializedName("img")
        val img: String,
        @SerializedName("product")
        val product: Product)
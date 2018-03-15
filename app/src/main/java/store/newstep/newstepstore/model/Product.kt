package store.newstep.newstepstore.model

import com.google.gson.annotations.SerializedName

/**
 * Created by wyacheslav on 27.02.18.
 * Товар
 */
data class Product(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("img")
        val img: String,
        @SerializedName("category")
        val category: Category)
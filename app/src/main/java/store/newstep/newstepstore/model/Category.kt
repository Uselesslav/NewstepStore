package store.newstep.newstepstore.model

import com.google.gson.annotations.SerializedName

/**
 * Created by wyacheslav on 27.02.18.
 * Категория
 */
data class Category(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String)
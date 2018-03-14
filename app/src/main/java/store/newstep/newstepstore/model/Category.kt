package store.newstep.newstepstore.model

import com.google.gson.annotations.SerializedName

/**
 * Created by wyacheslav on 27.02.18.
 * Категория
 * TODO убрать дефолтные значения из конструктора
 */
data class Category(
        @SerializedName("id")
        val id: Int = 0,
        @SerializedName("name")
        val name: String = "category")
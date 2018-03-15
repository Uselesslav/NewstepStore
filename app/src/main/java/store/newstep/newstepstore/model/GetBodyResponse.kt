package store.newstep.newstepstore.model

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by wyacheslav on 14.03.18.
 * Список цветов для получения с сервера
 * TODO: постараться сделать универсальным методом получения списков с сервера
 */
data class GetBodyResponse<T>(
        @SerializedName("colors")
        val colors: Array<T>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetBodyResponse<*>

        if (!Arrays.equals(colors, other.colors)) return false

        return true
    }

    override fun hashCode(): Int {
        return Arrays.hashCode(colors)
    }
}
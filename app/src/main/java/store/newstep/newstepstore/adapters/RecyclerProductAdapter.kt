package store.newstep.newstepstore.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import store.newstep.newstepstore.R
import store.newstep.newstepstore.model.Color

/**
 * Created by wyacheslav on 28.02.18.
 * Адаптер горизонтального списка товаров для главного экрана
 */
class RecyclerProductAdapter(private val colors: Array<Color>)
    : RecyclerView.Adapter<RecyclerProductAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder =
            ProductHolder(LayoutInflater.from(parent.context).inflate(R.layout.holder_product, parent, false))

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val color = colors[position]

        // Заполнение полей разметки
        holder.name.text = color.product.name
        holder.category.text = color.product.category.name
        holder.price.text = color.price.toString()
    }

    override fun getItemCount() = colors.size

    class ProductHolder(view: View) : RecyclerView.ViewHolder(view) {
        /**
         * Разметка элемента
         */
        val name: TextView = view.findViewById<TextView>(R.id.tv_name)
        val category: TextView = view.findViewById<TextView>(R.id.tv_category)
        val price: TextView = view.findViewById<TextView>(R.id.tv_price)
    }
}

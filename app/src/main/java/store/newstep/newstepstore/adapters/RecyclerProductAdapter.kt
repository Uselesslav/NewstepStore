package store.newstep.newstepstore.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import store.newstep.newstepstore.R
import store.newstep.newstepstore.model.Product

/**
 * Created by wyacheslav on 28.02.18.
 * Адаптер горизонтального списка товаров для главного экрана
 */
class RecyclerProductAdapter(private val products: Array<Product>)
    : RecyclerView.Adapter<RecyclerProductAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.holder_product, parent, false)

        return ProductHolder(v)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val product = products[position]

        holder.name.text = product.name
        holder.category.text = product.category.name
        holder.price.text = product.price.toString()
    }

    override fun getItemCount() = products.size

    class ProductHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById<TextView>(R.id.tv_name)
        val category: TextView = view.findViewById<TextView>(R.id.tv_category)
        val price: TextView = view.findViewById<TextView>(R.id.tv_price)
    }
}

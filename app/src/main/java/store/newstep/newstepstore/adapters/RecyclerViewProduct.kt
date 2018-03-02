package store.newstep.newstepstore.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.holder_product.view.*
import store.newstep.newstepstore.R
import store.newstep.newstepstore.inflate
import store.newstep.newstepstore.model.Product

/**
 * Created by wyacheslav on 28.02.18.
 * Адаптер горизонтального списка товаров для главного экрана
 */
class RecyclerViewProduct(private val products: List<Product>)
    : RecyclerView.Adapter<RecyclerViewProduct.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val inflatedView = parent?.inflate(R.layout.holder_product, false)

        return ProductHolder(inflatedView!!)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val itemPhoto = products[position]
        holder.bindPhoto(itemPhoto)
    }

    override fun getItemCount() = products.size

    class ProductHolder(
            private var v: View)
        : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var product: Product? = null

        override fun onClick(p0: View?) {
            // TODO("not implemented")
        }

        init {
            v.setOnClickListener(this)
        }

        fun bindPhoto(product: Product) {
            this.product = product
            //Glide.with(v.context).load(product.linkOnImage).into(v.iv_background)
            v.tv_name.text = product.name
            v.tv_category.text = product.category.name
            v.tv_price.text = product.price.toString()
            v.iv_background.setImageResource(R.drawable.ic_launcher_background)
        }
    }
}

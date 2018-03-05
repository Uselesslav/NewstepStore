package store.newstep.newstepstore.fragments

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import store.newstep.newstepstore.R
import store.newstep.newstepstore.adapters.RecyclerProductAdapter
import store.newstep.newstepstore.model.Product

/**
 * Created by wyacheslav on 27.02.18.
 * Главный экран приложения
 */
class Main : Fragment() {
    private lateinit var products: Array<Product>
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreate(savedInstanceState)
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)

        products = getProducts()

        val rv = rootView.findViewById<RecyclerView>(R.id.rv_product)
        rv.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
        val adapter = RecyclerProductAdapter(products)
        rv.adapter = adapter

        return rootView
    }

    /**
     * Возвращает список товаров
     * TODO заменить реальными товарами
     */
    fun getProducts(): Array<Product> = arrayOf<Product>(Product(), Product(), Product(), Product(), Product(), Product(), Product(), Product(), Product(), Product(), Product(), Product(), Product(), Product(), Product())

}
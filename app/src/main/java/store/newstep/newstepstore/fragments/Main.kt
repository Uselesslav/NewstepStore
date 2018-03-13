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
    /**
     * Массив товаров
     */
    private lateinit var products: Array<Product>

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreate(savedInstanceState)
        // Разметка фрагмента
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)

        products = getProducts()

        // Список топ товаров
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
    private fun getProducts(): Array<Product> = Array(15, { i -> Product("name$i") })

}
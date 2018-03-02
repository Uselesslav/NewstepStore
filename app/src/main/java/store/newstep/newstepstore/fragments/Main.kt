package store.newstep.newstepstore.fragments

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*
import store.newstep.newstepstore.R
import store.newstep.newstepstore.adapters.RecyclerViewProduct
import store.newstep.newstepstore.model.Product

/**
 * Created by wyacheslav on 27.02.18.
 * Главный экран приложения
 */
class Main : Fragment() {
    private lateinit var adapter: RecyclerViewProduct
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreate(savedInstanceState)
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)
        val arrayProduct = getProducts()

        linearLayoutManager = LinearLayoutManager(activity)
        rv_product?.layoutManager = linearLayoutManager

        adapter = RecyclerViewProduct(arrayProduct)
        rv_product?.adapter = adapter

        return rootView
    }

    /**
     * Возвращает список товаров
     * TODO заменить реальными товарами
     */
    fun getProducts(): List<Product> = arrayListOf<Product>(Product(), Product(), Product())

}
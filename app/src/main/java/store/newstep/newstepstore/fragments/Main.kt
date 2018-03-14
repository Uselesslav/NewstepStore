package store.newstep.newstepstore.fragments

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import store.newstep.newstepstore.R
import store.newstep.newstepstore.adapters.RecyclerProductAdapter
import store.newstep.newstepstore.model.Color
import store.newstep.newstepstore.model.GetBodyResponse
import store.newstep.newstepstore.retrofit.NewstepStoreServiceAPI


/**
 * Created by wyacheslav on 27.02.18.
 * Главный экран приложения
 */
class Main : Fragment() {
    /**
     * Массив товаров
     */
    private lateinit var colors: Array<Color>

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreate(savedInstanceState)
        // Разметка фрагмента
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)

        colors = arrayOf(Color())

        // Список топ товаров
        val rv = rootView.findViewById<RecyclerView>(R.id.rv_product)
        rv.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)


        val apiService = NewstepStoreServiceAPI.create()
        val call = apiService.getTopColors()
        call.enqueue(object : Callback<GetBodyResponse<Color>> {
            override fun onFailure(call: Call<GetBodyResponse<Color>>?, t: Throwable?) {
                t?.printStackTrace()
                Toast.makeText(activity!!, "FUCK", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<GetBodyResponse<Color>>?, response: Response<GetBodyResponse<Color>>?) {
                if (response != null) {
                    Toast.makeText(activity!!, "YES", Toast.LENGTH_SHORT).show()
                    colors = response.body()!!.colors.clone()
                    val adapter = RecyclerProductAdapter(colors)
                    rv.adapter = adapter
                }
            }
        })

        return rootView
    }
}
package store.newstep.newstepstore.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import store.newstep.newstepstore.R

/**
 * Created by wyacheslav on 27.02.18.
 * Главный экран приложения
 */
class Main : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)

        return rootView
    }
}
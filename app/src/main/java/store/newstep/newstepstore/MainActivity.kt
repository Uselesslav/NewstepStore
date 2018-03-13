package store.newstep.newstepstore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import store.newstep.newstepstore.fragments.Main

/**
 * Точка входа в приложение
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Открытие фрагмента главного экрана
        fragmentManager
                .beginTransaction()
                .add(R.id.fl_container, Main())
                .commit()
    }
}

package cz.muni.fi.pv256.hw2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

const val FRAGMENT_SECOND = "FRAGMENT2_TEXT"

class SecondActivity : AppCompatActivity(R.layout.activity_second) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO create SecondFragment programmatically, pass it FRAGMENT2_TEXT and place it into container view
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment.newInstance(intent.getStringExtra(FRAGMENT_SECOND).toString()))
                .commitNow()
        }
    }
}

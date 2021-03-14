package cz.muni.fi.pv256.hw2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val FRAGMENT_TEXT = "First Activity"
private const val FRAGMENT2_TEXT = "Second Activity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO set FRAGMENT_TEXT in TextFragment

        val gotoButton = findViewById<Button>(R.id.goto_button)
        gotoButton.setOnClickListener {
            // TODO go to SecondActivity
        }
    }
}

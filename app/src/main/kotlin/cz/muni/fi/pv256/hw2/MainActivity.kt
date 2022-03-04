package cz.muni.fi.pv256.hw2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val FRAGMENT_TEXT = "First Activity"
private const val FRAGMENT2_TEXT = "Second Activity"

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO set FRAGMENT_TEXT in TextFragment
        val textFragment = supportFragmentManager.findFragmentById(R.id.text_fragment) as TextFragment
        textFragment.setText(FRAGMENT_TEXT)

        val gotoButton = findViewById<Button>(R.id.goto_button)
        gotoButton.setOnClickListener {
            // TODO go to SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("FRAGMENT2_TEXT", FRAGMENT2_TEXT)
            startActivity(intent)
        }
    }
}


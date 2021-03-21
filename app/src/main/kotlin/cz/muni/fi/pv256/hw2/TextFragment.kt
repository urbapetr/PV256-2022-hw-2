package cz.muni.fi.pv256.hw2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class TextFragment : Fragment(R.layout.fragment_text) {

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.text)
    }

    fun setText(text: String) {
        textView.text = text
    }
}

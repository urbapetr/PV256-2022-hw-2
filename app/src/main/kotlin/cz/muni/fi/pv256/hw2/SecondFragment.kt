package cz.muni.fi.pv256.hw2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

private const val FRAGMENT_TEXT = "basic"

class SecondFragment : Fragment(R.layout.fragment_text) {
    companion object {
        @JvmStatic
        fun newInstance(stringArg: String) = SecondFragment().apply {
            arguments = bundleOf(
                FRAGMENT_TEXT to stringArg
            )
        }
    }

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arg = arguments?.getString(FRAGMENT_TEXT) ?: ""
        textView = view.findViewById(R.id.text)
        textView.setText(arg)
    }
}

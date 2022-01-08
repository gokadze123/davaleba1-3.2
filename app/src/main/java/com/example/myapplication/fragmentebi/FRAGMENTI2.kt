package com.example.myapplication.fragmentebi

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class FRAGMENTI2 : Fragment(R.layout.second_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textView).text =
            FRAGMENTI2Args.fromBundle(requireArguments()).amount.toString()


    }

}
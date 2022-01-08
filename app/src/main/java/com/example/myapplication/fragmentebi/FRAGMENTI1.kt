package com.example.myapplication.fragmentebi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class FRAGMENTI1 : Fragment(R.layout.first_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val sendButton = view.findViewById<Button>(R.id.button_send)
        val amountText = view.findViewById<EditText>(R.id.edit_text)
        val cotroller = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val amountText1 = amountText.text.toString()
            if(amountText1.isEmpty()){
                return@setOnClickListener


            }



            val amount = amountText1.toInt()
            val action = FRAGMENTI1Directions.actionFRAGMENTI1ToFRAGMENTI2(amount)
            cotroller.navigate(action)
        }


    }

    }



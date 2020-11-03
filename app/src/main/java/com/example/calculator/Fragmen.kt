package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class fragmenMain : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        buttonClear.setOnClickListener {
            inputField.text.clear()
            inputField2.text.clear()
            znak.text.clear()
        }
// все проверить
        buttonOK.setOnClickListener {
            var inputField1 = (inputField.text.toString()).toDouble()
            Log.i("inputField", inputField1.toString())
            var inputField2 = (inputField2.text.toString()).toDouble()
            Log.i("inputField2", inputField2.toString())
            var value = znak.text.toString()
            when (value) {
                "+" ->
                    value = (inputField1 + inputField2).toString()

                "-" -> value= (inputField1 - inputField2).toString()
                "*" -> value = (inputField1*inputField2).toString()
                "/" -> value = (inputField1/inputField2).toString()
            }// доработать меню если нет значений

        }
    }

}
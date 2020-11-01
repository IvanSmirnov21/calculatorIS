package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_seccond.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClear.setOnClickListener {
            inputField.text.clear()
        inputField2.text.clear()
            znak.text.clear()
        }

        buttonOK.setOnClickListener {
            var inputField1 = (inputField.text.toString()).toDouble()
            Log.i("inputField", inputField1.toString())
            var inputField2 = (inputField2.text.toString()).toDouble()
            Log.i("inputField2", inputField2.toString())
            startActivity(intent)
            var znak2 = znak.text.toString()
            when (znak2) { // доработать название переменной
                "+" ->
                    znak2 = (inputField1 + inputField2).toString()

                "-" -> znak2= (inputField1 - inputField2).toString()
                "*" -> znak2 = (inputField1*inputField2).toString()
                "/" -> znak2 = (inputField1/inputField2).toString()
            }// доработать меню если нет значений


            val intent = Intent(this, seccondActivity::class.java)
            intent.putExtra("input", znak2)
            startActivity(intent)
        }
        }
            }






package com.example.calculatorapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var sonucEkran: TextView
    private var girilen = ""
    private var toplam = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sonucEkran = findViewById(R.id.sonucEkran)

        val buttonIds = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3,
            R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        )

        for (id in buttonIds) {
            findViewById<Button>(id).setOnClickListener {
                val digit = (it as Button).text.toString()
                 girilen += digit
                 sonucEkran.text = girilen
            }
        }

        findViewById<Button>(R.id.btnEquals).setOnClickListener {
            if (girilen.isNotEmpty()) {
                toplam += girilen.toInt()
                sonucEkran.text = toplam.toString()
                girilen = ""
            }
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            girilen = ""
            toplam = 0
            sonucEkran.text = "0"
        }
    }
}
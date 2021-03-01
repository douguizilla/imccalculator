package com.odougle.imccalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    fun setListeners(){
        btCalculate.setOnClickListener {
            imcCalc(edtPeso.text.toString(),edtAltura.text.toString())
        }
    }

    private fun imcCalc(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if(peso != null &&  altura != null){
            val imc = peso / (altura * altura)
            txtTittle.text = "Seu IMC é ${imc}"
            txtTittle.textSize = 24F
        }
    }
}
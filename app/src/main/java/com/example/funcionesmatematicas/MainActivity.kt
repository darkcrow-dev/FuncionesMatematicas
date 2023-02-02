package com.example.funcionesmatematicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numeroUno = findViewById<EditText>(R.id.numeroUno)
        var numeroDos = findViewById<EditText>(R.id.numeroDos)
        var resultados = findViewById<TextView>(R.id.resultado)

        var botonSumar = findViewById<Button>(R.id.sumar)
        var botonRestar = findViewById<Button>(R.id.restar)
        var botonMultiplicar = findViewById<Button>(R.id.multiplicar)
        var botonDividir = findViewById<Button>(R.id.dividir)

        var texto1: String
        var texto2: String

        resultados.text = ""

        botonSumar.setOnClickListener {
            texto1 = numeroUno.text.toString()
            texto2 = numeroDos.text.toString()

            var sumar = (texto1.toDouble() + texto2.toDouble()).toString()
            resultados.text = sumar
        }

        botonRestar.setOnClickListener {
            texto1 = numeroUno.text.toString()
            texto2 = numeroDos.text.toString()

            var restar = (texto1.toDouble() - texto2.toDouble()).toString()
            resultados.text = restar
        }

        botonMultiplicar.setOnClickListener {
            texto1 = numeroUno.text.toString()
            texto2 = numeroDos.text.toString()

            var multiplicar = ( (texto1.toDouble())*(texto2.toDouble())).toString()
            resultados.text = multiplicar
        }

        botonDividir.setOnClickListener {
            texto1 = numeroUno.text.toString()
            texto2 = numeroDos.text.toString()

            var dividir = ( (texto1.toDouble())/(texto2.toDouble())).toString()
            resultados.text = dividir
        }
    }
}
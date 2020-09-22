package com.example.romao_continuada1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun Aproveitamento(componente: View) {
        var valorVitoria = campo2.text.toString().toInt() * 3
        var valorEmpate = campo3.text.toString().toInt() * 1
        var valorDerrota = campo4.text.toString().toInt() * 0

        var total = valorVitoria + valorEmpate + valorDerrota

        var pontoPorJogos =
            campo2.text.toString().toInt() + campo3.text.toString().toInt() + campo4.text.toString()
                .toInt() * 3

        var resultado = (total / pontoPorJogos) * 100

        if (resultado >= 60) {
            Mg_secreta.text ="O ${campo1.text} tem o aproveitamento de ${resultado}%, ou seja, está Bom"
            Mg_secreta.visibility = View.VISIBLE
            return
        }
        if (resultado >= 50 && resultado <= 59) {
            Mg_secreta.text ="O ${campo1.text} tem o aproveitamento de ${resultado}%, ou seja, está Regular"
            Mg_secreta.visibility = View.VISIBLE
        } else (resultado < 50)
            Mg_secreta.text ="O ${campo1.text} tem o aproveitamento de ${resultado}%, ou seja, está Ruim"
            Mg_secreta.visibility = View.VISIBLE
    }
}
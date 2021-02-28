package com.example.fiqueirico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvNumeros: TextView
    private lateinit var btNovo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvNumeros = findViewById(R.id.tvNumeros)
        this.btNovo = findViewById(R.id.btNovo)

        this.btNovo.setOnClickListener(OnClickBotao())

    }

    inner class OnClickBotao : View.OnClickListener{
        override fun onClick(p0: View?) {
            this@MainActivity.tvNumeros.text = Megasena.getInstance().joinToString(" ")

        }
    }

}

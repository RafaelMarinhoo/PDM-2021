package com.example.deviceinfo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvInformacao: TextView
    private lateinit var btExibir: Button
    private lateinit var tvSobre: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvInformacao = findViewById(R.id.tvInfo)
        this.tvSobre = findViewById(R.id.tvSobre)
        this.btExibir = findViewById(R.id.btSobre)

        this.btExibir.setOnClickListener {
            this.tvSobre.text = "ID do Build"
        }

        this.tvInformacao.text = Build.ID
    }
}
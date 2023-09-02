package com.example.modul3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputSatu = findViewById<EditText>(R.id.inputSatu)
        val inputDua = findViewById<EditText>(R.id.inputDua)
        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKali = findViewById<Button>(R.id.btnKali)
        val btnKurang = findViewById<Button>(R.id.btnKurang)
        val btnBagi = findViewById<Button>(R.id.btnBagi)
        val txtHasil = findViewById<TextView>(R.id.txtHasil)

        // Penjumlahan
        btnTambah.setOnClickListener {
            if (inputSatu.text.isNotBlank() && inputDua.text.isNotBlank()) {
                val a: Int = inputSatu.text.toString().toInt()
                val b: Int = inputDua.text.toString().toInt()
                val hasil = a + b
                txtHasil.text = "Result : $hasil"
            } else {
                Toast.makeText(this, "Input dulu ngab", Toast.LENGTH_SHORT).show()
            }
        }

        // Pengurangan
        btnKurang.setOnClickListener {
            if (inputSatu.text.isNotBlank() && inputDua.text.isNotBlank()) {
                val a: Int = inputSatu.text.toString().toInt()
                val b: Int = inputDua.text.toString().toInt()
                val hasil = a - b
                txtHasil.text = "Result : $hasil"
            } else {
                Toast.makeText(this, "Input dulu ngab", Toast.LENGTH_SHORT).show()
            }
        }

        // Perkalian
        btnKali.setOnClickListener {
            if (inputSatu.text.isNotBlank() && inputDua.text.isNotBlank()) {
                val a: Int = inputSatu.text.toString().toInt()
                val b: Int = inputDua.text.toString().toInt()
                val hasil = a * b
                txtHasil.text = "Result : $hasil"
            } else {
                Toast.makeText(this, "Input dulu ngab", Toast.LENGTH_SHORT).show()
            }
        }

        // Pembagian
        btnBagi.setOnClickListener {
            if (inputSatu.text.isNotBlank() && inputDua.text.isNotBlank()) {
                val a: Int = inputSatu.text.toString().toInt()
                val b: Int = inputDua.text.toString().toInt()
                if (b != 0) {
                    val hasil = a.toDouble() / b.toDouble()
                    txtHasil.text = "Result : $hasil"
                } else {
                    Toast.makeText(this, "Pembagian oleh nol tidak diizinkan", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Input dulu ngab", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

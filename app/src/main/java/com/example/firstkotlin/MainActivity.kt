package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var lebar:EditText
    private lateinit var panjang:EditText
    private lateinit var tinggi:EditText
    private lateinit var tombol:Button
    private lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lebar = findViewById(R.id.edt_width)
        panjang = findViewById(R.id.edt_length)
        tinggi = findViewById(R.id.edt_height)
        tombol = findViewById(R.id.btn_calculate)
        text = findViewById(R.id.tv_result)

        tombol.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val width = lebar.text.toString().trim().toDouble()
        val lenght = panjang.text.toString().trim().toDouble()
        val tinggibanget = tinggi.text.toString().trim().toDouble()


        val jumlah:Double= width*lenght*tinggibanget
        text.text= jumlah.toString()

    }
}
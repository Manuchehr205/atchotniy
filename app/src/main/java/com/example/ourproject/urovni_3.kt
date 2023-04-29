package com.example.ourproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class urovni_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.urovni_3)
        var legkiy = findViewById<Button>(R.id.legkiy)
        var sredniy = findViewById<Button>(R.id.sredniy)
        var expert = findViewById<Button>(R.id.ekspert)
        legkiy.setOnClickListener {
            var intent = Intent(this, legkiy_1::class.java)
            startActivity(intent)
        }
    }
}
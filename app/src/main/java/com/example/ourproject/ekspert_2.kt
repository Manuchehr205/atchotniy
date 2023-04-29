package com.example.ourproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ekspert_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ekspert_2)
        var otvet = "119"
        var one = findViewById<Button>(R.id.one)
        var one_text = one.text.toString()
        var two = findViewById<Button>(R.id.two)
        var two_text = two.text.toString()
        var three = findViewById<Button>(R.id.three)
        var three_text = three.text.toString()
        var four = findViewById<Button>(R.id.four)
        var four_text = four.text.toString()
        one.setOnClickListener {
            if (one_text == otvet) {
                var intent = Intent(this, urovni_3::class.java)
                startActivity(intent)
                var toast = Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                var toast = Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT)
                toast.show()
            }
            two.setOnClickListener {
                if (two_text == otvet) {
                    var intent = Intent(this, urovni_3::class.java)
                    startActivity(intent)
                    var toast = Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT)
                    toast.show()
                } else {
                    var toast =
                        Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
            three.setOnClickListener {
                if (three_text == otvet) {
                    var intent = Intent(this, urovni_3::class.java)
                    startActivity(intent)
                    var toast = Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT)
                    toast.show()
                } else {
                    var toast =
                        Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
            four.setOnClickListener {
                if (four_text == otvet) {
                    var intent = Intent(this, urovni_3::class.java)
                    startActivity(intent)
                    var toast = Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT)
                    toast.show()
                } else {
                    var toast =
                        Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}
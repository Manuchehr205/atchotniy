package com.example.ourproject

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.view)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var intent = Intent(this, Uroven_1::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.tage, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.music ->{
                var resId = resources.getIdentifier(R.raw.muzon.toString(), "raw", this.packageName)
                val mediaPlayer = MediaPlayer.create(this, resId)
                mediaPlayer.start()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
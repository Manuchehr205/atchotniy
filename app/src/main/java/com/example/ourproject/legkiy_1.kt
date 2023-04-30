package com.example.ourproject

import android.content.Intent
import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class legkiy_1 : AppCompatActivity() {
    var mediaPlayer : MediaPlayer?= MediaPlayer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.legkiy_1)
        var otvet = "26"
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
                audioPlayer("pole_letter_correct.mp3")
                var intent = Intent(this, legkiy_2::class.java)
                startActivity(intent)
                var toast = Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                audioPlayer("false_sound.mp3")
                var toast = Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
        two.setOnClickListener {
            if (two_text == otvet) {
                audioPlayer("pole_letter_correct.mp3")
                var intent = Intent(this, legkiy_2::class.java)
                startActivity(intent)
                var toast = Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                audioPlayer("false_sound.mp3")
                var toast = Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT)
                toast.show()
            }
        }

            three.setOnClickListener {
                if (three_text == otvet) {
                    audioPlayer("pole_letter_correct.mp3")
                    var intent = Intent(this, legkiy_2::class.java)
                    startActivity(intent)
                    var toast = Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT)
                    toast.show()
                } else {
                    audioPlayer("false_sound.mp3")
                    var toast = Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
            four.setOnClickListener {
                if (four_text == otvet) {
                    audioPlayer("pole_letter_correct.mp3")
                    var intent = Intent(this, legkiy_2::class.java)
                    startActivity(intent)
                    var toast = Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT)
                    toast.show()
                } else {
                    audioPlayer("false_sound.mp3")
                    var toast =
                        Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT)
                    toast.show()
                }

        }
    }
    private fun audioPlayer(fullPath: String) {
        try {
            if (mediaPlayer != null) {
                mediaPlayer?.stop()
                mediaPlayer?.release()
                mediaPlayer = null
            }
            mediaPlayer = MediaPlayer()
            val decs: AssetFileDescriptor = this.resources.assets.openFd(fullPath)
            mediaPlayer?.setDataSource(decs.fileDescriptor, decs.startOffset, decs.length)
            decs.close()
            mediaPlayer?.prepare()
            mediaPlayer?.setVolume(1f, 1f)
            mediaPlayer?.isLooping = false
            mediaPlayer?.start()
        } catch (ex: Exception) {
            Log.i("", ex.message!!)
        }
    }
}
package com.example.ourproject

import android.content.Intent
import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class osnovnoy : AppCompatActivity() {
    var mediaPlayer : MediaPlayer?=MediaPlayer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.osnovnoy)
        var textView = findViewById<TextView>(R.id.view)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var intent = Intent(this, urovni_3::class.java)
            startActivity(intent)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.tage, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.music_1 ->{
                audioPlayer("")
                audioPlayer("muzon.mp3")
            }
            R.id.music_2 ->{
                audioPlayer("")
                audioPlayer("muzon_2.mp3")
            }
            R.id.music_3 ->{
                audioPlayer("")
                audioPlayer("muzon_3.mp3")
            }
        }
        return super.onOptionsItemSelected(item)
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

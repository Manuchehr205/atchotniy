package com.example.ourproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Database
import com.example.ourproject.room.DataRoomBase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
        val db = DataRoomBase.getInstance(this)
        GlobalScope.launch {
            (0..10).forEach{
                db.roomDao().insertAll
            }
        }
    }
}
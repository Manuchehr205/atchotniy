package com.example.ourproject.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = [RoomEntity::class], version = 1)
abstract class DataRoomBase : androidx.room.RoomDatabase(){
    abstract  fun roomDao(): RoomDao
        companion object{
            @Volatile
            private  var INSTANCE: DataRoomBase? = null
            fun getInstance(context: Context) {
                synchronized(this){
                    var instance = INSTANCE
                    if (instance == null){
                        instance = Room.databaseBuilder(
                    context,
                    DataRoomBase::class.java,
                    "database_name"
                    ).build()
                    INSTANCE = instance
                }
                }
            }
        }

}
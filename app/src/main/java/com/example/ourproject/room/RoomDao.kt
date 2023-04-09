package com.example.ourproject.room

import androidx.room.Dao
import androidx.room.Query
import com.example.ourproject.room.RoomEntity

@Dao
interface RoomDao {
    @Query("SELECT * FROM user")
    suspend fun getAll(): List<RoomEntity>
    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    suspend fun loadAllByIds(userIds : IntArray)
}
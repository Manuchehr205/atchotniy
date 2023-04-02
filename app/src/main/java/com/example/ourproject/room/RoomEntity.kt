package com.example.ourproject.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "name")
data class RoomEntity(
    @PrimaryKey val uid : Int,
    @ColumnInfo(name = "first_name") val firstName : String?,
    @ColumnInfo(name = "last_name") val lastName : String?
)


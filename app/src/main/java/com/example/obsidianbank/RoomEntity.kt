package com.example.obsidianbank

import android.icu.text.CaseMap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class RoomEntity {
    @Entity
    data class User (
        @PrimaryKey var title :String,
        @ColumnInfo (name = "firstName")val firstName :String,
        @ColumnInfo (name = "secondName")val secondName :String,
            )
}
package com.example.obsidianbank

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

class RoomDao {
    @Dao
   interface UserDao{
       @Query("select * FROM User")
       fun getAll():List<RoomEntity.User>

       @Query("select * FROM User WHERE firstName LIKE : first AND" +"lastName LIKE : last LIMIT 1")
       fun findByName(first : String , last :String):RoomEntity.User

        @Insert
        fun insertAll (vararg Users:RoomEntity.User)

        @Delete
        fun delete(User : RoomEntity.User)

   }
}
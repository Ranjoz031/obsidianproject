package com.example.obsidianbank

import androidx.room.Database
import androidx.room.RoomDatabase
import com.google.firebase.firestore.auth.User
import kotlinx.coroutines.CoroutineScope
import java.security.Provider

class UserDatabase {
    @Database(entities = [User::class],version=1)
    abstract class AppDatabase : RoomDatabase(){
        abstract fun userDao():RoomDao.UserDao
    }
}


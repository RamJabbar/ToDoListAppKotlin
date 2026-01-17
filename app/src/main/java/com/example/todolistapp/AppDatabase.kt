package com.example.todolistapp

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [TaskItem::class], version = 2)
@TypeConverters(Converters::class) // Add this line
abstract class AppDatabase : RoomDatabase() {
    // ... your DAO methods
}
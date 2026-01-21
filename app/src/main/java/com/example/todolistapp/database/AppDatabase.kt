package com.example.todolistapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todolistapp.Converters
import com.example.todolistapp.taskitem.TaskItem

@Database(entities = [TaskItem::class], version = 2)
@TypeConverters(Converters::class) // Add this line
abstract class AppDatabase : RoomDatabase() {
    // ... your DAO methods
}
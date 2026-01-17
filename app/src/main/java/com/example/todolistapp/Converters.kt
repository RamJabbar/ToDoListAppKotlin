package com.example.todolistapp

import androidx.room.TypeConverter
import java.time.LocalDate

class Converters {

    // Convert Long ke LocalDate untuk UI
    @TypeConverter
    fun fromTimestamp(value: Long?): LocalDate? {
        return value?.let { LocalDate.ofEpochDay(it) }
    }

    // Convert LocalDate ke Long untuk database
    @TypeConverter
    fun dateToTimestamp(date: LocalDate?): Long? {
        return date?.toEpochDay()
    }
}
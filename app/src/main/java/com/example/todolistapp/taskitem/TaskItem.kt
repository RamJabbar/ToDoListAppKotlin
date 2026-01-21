package com.example.todolistapp.taskitem

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todolistapp.R
import java.time.LocalDate

@Entity(tableName = "task_item_table")
data class TaskItem(
    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "desc")
    var desc: String,

    @ColumnInfo(name = "completedDate")
    var completedDate: Long? = null,

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
)
{
    fun imageResource(): Int = if (isCompleted()) R.drawable.octagon_check else R.drawable.unchecked


    fun isCompleted(): Boolean {
        return completedDate != null
    }


    fun completedDateString(): String {
        return completedDate?.let {
            LocalDate.ofEpochDay(it).toString()
        } ?: ""
    }
}
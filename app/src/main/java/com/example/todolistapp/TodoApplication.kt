package com.example.todolistapp

import android.app.Application
import com.example.todolistapp.database.TaskItemDatabase
import com.example.todolistapp.taskitem.TaskItemRepository

class TodoApplication: Application()
{
    val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repository by lazy { TaskItemRepository(database.taskItemDao()) }
}




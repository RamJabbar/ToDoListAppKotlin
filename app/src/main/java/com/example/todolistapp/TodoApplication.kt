package com.example.todolistapp

import android.app.Application

class TodoApplication: Application()
{
    val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repository by lazy { TaskItemRepository(database.taskItemDao()) }
}




package com.example.todolistapp.taskitem

import androidx.annotation.WorkerThread
import com.example.todolistapp.interfacee.TaskItemDao
import kotlinx.coroutines.flow.Flow

class TaskItemRepository (private val taskItemDao: TaskItemDao)

{
    val allTaskItems: Flow<List<TaskItem>> = taskItemDao.allTaskItems()

    @WorkerThread
    suspend fun insertTaskItem(taskItem: TaskItem)
    {
        taskItemDao.insertTaskItem(taskItem)
    }

    suspend fun updateTaskItem(taskItem: TaskItem)
    {
        taskItemDao.updateTaskItem(taskItem)
    }
    suspend fun  deleteTaskItem(taskItem: TaskItem)
    {
        taskItemDao.deleteTaskItem(taskItem)
    }


}
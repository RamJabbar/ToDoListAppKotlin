package com.example.todolistapp

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.todolistapp.databinding.TaskItemCellBinding

class TaskItemViewHolder(
    private val context: Context,
    private val binding: TaskItemCellBinding,
    private val clickListener: TaskItemClickListener
) : RecyclerView.ViewHolder(binding.root)
{
    fun bindTaskItem(taskItem: TaskItem)
    {
        binding.name.text = taskItem.name

        if (taskItem.isCompleted()){
            binding.completeButton.setImageResource(R.drawable.octagon_check)
    }
        binding.completeButton.setOnClickListener{
            clickListener.completeTaskItem(taskItem)
        }
        binding.taskItemCell.setOnClickListener{
            clickListener.editTaskItem(taskItem)
        }

        binding.deleteButton.setOnClickListener {
            clickListener.deleteTaskItem(taskItem)
        }

    }
}

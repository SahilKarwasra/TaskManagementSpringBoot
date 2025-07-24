package com.taskmanagement.TaskManagement.service

import com.taskmanagement.TaskManagement.model.Task
import com.taskmanagement.TaskManagement.repository.TaskRepository
import org.bson.types.ObjectId
import org.springframework.stereotype.Service


@Service
class TaskService(
    private val taskRepository: TaskRepository
) {

    fun saveTask(task: Task) : Task = taskRepository.save(task)

    fun getTask() : List<Task> = taskRepository.findAll()

    fun editTask(id: ObjectId, updatedTask: Task) : Task {
        val existingTask = taskRepository.findById(id)
            .orElseThrow{(RuntimeException("Task not found with this id $id"))}

        val taskToSave = existingTask.copy(
            title = updatedTask.title,
            description = updatedTask.description,
            isCompleted = updatedTask.isCompleted,
            createdAt = existingTask.createdAt
        )

        return taskRepository.save(taskToSave)
    }

    fun deleteTask(id: ObjectId) {
        val taskToBeDeleted  = taskRepository.findById(id)
            .orElseThrow { (RuntimeException("Task not Available with this Id $id")) }

        return taskRepository.delete(taskToBeDeleted)

    }

    fun markAsToggle(id: ObjectId): Task {
        val taskToBeToggle = taskRepository.findById(id)
            .orElseThrow { (RuntimeException("Task not Available with this Id $id")) }

        val newTask = taskToBeToggle.copy(
            isCompleted = !taskToBeToggle.isCompleted,
            createdAt = taskToBeToggle.createdAt
        )

        return taskRepository.save(newTask)

    }

}
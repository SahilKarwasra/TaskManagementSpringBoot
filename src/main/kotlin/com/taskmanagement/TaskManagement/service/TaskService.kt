package com.taskmanagement.TaskManagement.service

import com.taskmanagement.TaskManagement.model.Task
import com.taskmanagement.TaskManagement.repository.TaskRepository
import org.springframework.stereotype.Service


@Service
class TaskService(
    private val taskRepository: TaskRepository
) {

    fun saveTask(task: Task) : Task = taskRepository.save(task)

    fun getTask() : List<Task> = taskRepository.findAll()



}
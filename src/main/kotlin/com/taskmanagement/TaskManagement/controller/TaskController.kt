package com.taskmanagement.TaskManagement.controller

import com.taskmanagement.TaskManagement.model.Task
import com.taskmanagement.TaskManagement.service.TaskService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/task")
class TaskController(
    private val taskService: TaskService
) {

    @GetMapping
    fun getTasks() = taskService.getTask()

    @PostMapping
    fun createTask(@RequestBody newTask: Task) = taskService.saveTask(newTask)

}
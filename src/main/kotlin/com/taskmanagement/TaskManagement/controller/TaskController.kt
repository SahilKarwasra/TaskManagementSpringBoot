package com.taskmanagement.TaskManagement.controller

import com.taskmanagement.TaskManagement.model.Task
import com.taskmanagement.TaskManagement.service.TaskService
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
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

    @PutMapping("/{id}")
    fun editTask(@PathVariable id: String, @RequestBody task: Task)
        = taskService.editTask(ObjectId(id), task)

    @DeleteMapping("{id}")
    fun deleteTask(@PathVariable id: String)
        = taskService.deleteTask(ObjectId(id))

    @PatchMapping("{id}")
    fun toggleComplete(@PathVariable id: String)
        = taskService.markAsToggle(ObjectId(id))
}
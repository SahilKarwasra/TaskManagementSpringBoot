package com.taskmanagement.TaskManagement.repository

import com.taskmanagement.TaskManagement.model.Task
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface TaskRepository : MongoRepository<Task, ObjectId>
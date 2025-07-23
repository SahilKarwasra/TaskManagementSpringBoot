package com.taskmanagement.TaskManagement.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "tasks")
data class Task(
    @Id
    val id : ObjectId? = null,
    val title : String,
    val description : String,
    val isCompleted : Boolean = false,
    val createdAt : LocalDateTime = LocalDateTime.now()
)

import 'package:frontend/domain/task.dart';

abstract class Repo {
  Future<List<Task>> getTasks();
  Future<Task> createTask(Task task);
  Future<Task> updateTask(String id, Task task);
  Future deleteTask(String id);
  Future<String> markAsCompleted(Task task);
}
import 'dart:io';

import 'package:frontend/domain/repo.dart';
import 'package:frontend/domain/task.dart';

class RepoImpl extends Repo {


  @override
  Future<Task> createTask(Task task) {
    // TODO: implement createTask
    throw UnimplementedError();
  }

  @override
  Future deleteTask(String id) {
    // TODO: implement deleteTask
    throw UnimplementedError();
  }

  @override
  Future<List<Task>> getTasks() {
    // TODO: implement getTasks
    throw UnimplementedError();
  }

  @override
  Future<String> markAsCompleted(Task task) {
    // TODO: implement markAsCompleted
    throw UnimplementedError();
  }

  @override
  Future<Task> updateTask(String id, Task task) {
    // TODO: implement updateTask
    throw UnimplementedError();
  }

}
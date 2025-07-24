class Task {
  final String? id;
  final String title;
  final String description;
  final bool? isCompleted;
  final String? createdAt;
  final String updatedAt;

  Task({
    this.id,
    required this.title,
    required this.description,
    this.isCompleted = false,
    this.createdAt,
    required this.updatedAt,
  });

  factory Task.fromJson(Map<String, dynamic> json) {
    return Task(
      id: json['id'],
      title: json['title'],
      description: json['description'],
      isCompleted: json['isCompleted'] ?? false,
      createdAt: json['createdAt'],
      updatedAt: json['updatedAt'],
    );
  }

  Map<String, dynamic> toJson() {
    return {
      if (id != null) 'id': id,
      'title': title,
      'description': description,
      'isCompleted': isCompleted,
      'createdAt': createdAt,
      'updatedAt': updatedAt,
    };
  }
}

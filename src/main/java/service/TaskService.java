package service;

import entity.Task;

import java.util.List;

public interface TaskService {
   void createTask(Task task);
    void uptadeTask(Long id,Task task);
    void deleteTask(Long id);
    Task getTask(Long id);

    List<Task> getTasks();

}

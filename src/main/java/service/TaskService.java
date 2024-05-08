package service;

import entity.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    Task uptadeTask(Long id,Task task);
    Task deleteTask(Long id);
    Task getTask(Long id);

    List<Task> getTasks();

}

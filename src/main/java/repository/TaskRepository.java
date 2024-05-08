package repository;

import entity.Task;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class TaskRepository {
   private List<Task> tasks=new ArrayList<>();
}

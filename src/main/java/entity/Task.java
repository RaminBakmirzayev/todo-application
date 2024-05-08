package entity;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Task {
    private Long id;
    private String name;
    private String description;
    private Status status;
}

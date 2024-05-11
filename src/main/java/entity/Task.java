package entity;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Task {
    private Long id;
    private Long userId;
    private String name;
    private String description;
    private Status status;

    @Override
    public String toString() {
        return "[" + "Id: " + id + ",Name:"  + name + ",Description:" + description + ",Status:" + status  + ",user Id:" + userId + " " + "]";
    }
}
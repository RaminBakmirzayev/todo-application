package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {

    private Long id;
    private String name;
    private  String email;
    private String password;

    @Override
    public String toString() {
        return "[" + " "+name + " "+ "," + email  + "," + password + "," +id + "]";
    }
}

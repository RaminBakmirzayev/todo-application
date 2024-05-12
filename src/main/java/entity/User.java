package entity;

import lombok.Builder;
import lombok.Getter;

import lombok.Setter;

@Getter
@Setter
public class User {

    private Long id;
    private String name;
    private  String email;
    private String password;
    private boolean isActive=false;

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password =  password;
    }

    @Override
    public String toString() {
        return "[" + "Name: "+name +  ",Email:" + email  + ",Password:" + password + ",Id:" +id + " "+ "]";
    }
}

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

    @Override
    public String toString() {
        return "[" + "Name: "+name +  ",Email:" + email  + ",Password:" + password + ",Id:" +id + " "+ "]";
    }
}

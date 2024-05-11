package repository;

import entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Setter
@Getter
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(Long id, User user) {
        User user1 = findUserById(id);
        if (user1 == null) {
            System.out.println("User not found by id: " + id);
            return;
        }
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
    }

    public void removeUser(Long id) {
        if (findUserById(id) == null) {
            System.out.println("User not found by id: " + id);
            return;
        }
        for (User u : users) {
            if (u.getId().equals(id)) {
                users.remove(u);
                break;
            }
        }

    }

    public User findUserById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }

        }
        return null;
    }

    public User findUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst().orElse(null);
    }

}

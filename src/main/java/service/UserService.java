package service;

import entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User uptadeUser(Long id,User user);
    User deleteUser(Long id);

    User readUser(Long id);
    List<User> getAllUsers(Long id);
}

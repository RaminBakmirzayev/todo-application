package service;

import entity.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    void uptadeUser(Long id,User user);
    void deleteUser(Long id);
    User readUser(Long id);


    List<User> getAllUsers(Long id);
}

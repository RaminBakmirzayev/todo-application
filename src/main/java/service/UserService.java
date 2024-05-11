package service;

import dto.UserRequestDto;
import entity.User;

import java.util.List;

public interface UserService {
    void registerUser(User user);
    void loginUser(UserRequestDto userRequest);
    void logoutUser(Long userId);

    void uptadeUser(Long id,User user);
    void deleteUser(Long id);
    User readUser(Long id);


    List<User> getAllUsers();
}

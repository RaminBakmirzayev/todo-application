package service.impl;

import dto.UserRequestDto;
import entity.User;
import lombok.RequiredArgsConstructor;
import repository.UserRepository;
import service.UserService;

import java.util.List;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void registerUser(User user) {
        isPasswordNotValid(user);
        if (isNotEmailValid(user)) return;
        checkEmailUnique(user);

        userRepository.addUser(user);
        System.out.println("User" + user + "added successfully");
    }

    @Override
    public void loginUser(UserRequestDto userRequest) {
        User user = userRepository.findUserByEmail(userRequest.getEmail());
        if (user == null) {
            System.out.println("User not found by email " + userRequest.getEmail());
            return;
        }
        if (!user.getPassword().equals(userRequest.getPassword())) {
            System.out.println("User password not correct: " + userRequest.getPassword());
            return;
        }

        user.setActive(true);
    }

    @Override
    public void logoutUser(Long userId) {
        User userbyId = userRepository.findUserById(userId);
        if (userbyId == null) {
            System.out.println("User not found by id: " + userId);
            return;
        }
        userbyId.setActive(false);
    }

    @Deprecated
    public void checkEmailUnique(User user) {
        for (User us : userRepository.getUsers()) {
            if (us.getEmail().equals(user.getEmail())) {
                System.out.println("Email already exists");
                return;
            }
        }
    }

    private void isPasswordNotValid(User user) {
        if (user.getPassword().length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        return;
    }

    private boolean isNotEmailValid(User user) {
        if (!user.getEmail().matches("(.+)@(\\S+)$")) {
            System.out.println("Email not valid: " + user.getEmail());
            return true;
        }
        return false;
    }

    @Override
    public void uptadeUser(Long id, User user) {
        isPasswordNotValid(user);
        if (isNotEmailValid(user)) {
            return;
        }
        checkEmailUnique(user);
        userRepository.updateUser(id, user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.removeUser(id);
    }

    @Override
    public User readUser(Long id) {
        User userById = userRepository.findUserById(id);
        if (userById == null) {
            throw new RuntimeException("User not found by id: " + id);

        }

        return userById;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getUsers();

    }
}

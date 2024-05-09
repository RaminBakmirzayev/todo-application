package service.impl;

import entity.User;
import lombok.RequiredArgsConstructor;
import repository.UserRepository;
import service.UserService;

import java.util.List;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(User user) {
        String password = user.getPassword();
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }

     userRepository.addUser(user);
        System.out.println("User"+user+ "added successfully");
    }

    @Override
    public void uptadeUser(Long id, User user) {


    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User readUser(Long id) {

    }

    @Override
    public List<User> getAllUsers(Long id) {

    }
}

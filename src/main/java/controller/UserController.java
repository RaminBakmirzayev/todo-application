package controller;

import dto.UserRequestDto;
import entity.User;
import service.UserService;

import java.util.List;
import java.util.Scanner;


public class UserController {
    private final Scanner input = new Scanner(System.in);
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void registerUser() {
        Long id = Long.valueOf(imput("Enter id"));
        String name = imput("Enter your name");
        String email = imput("Enter your email");
        String password = imput("Enter your password");
        User user = new User(id, name, email, password);
        userService.registerUser(user);
    }

    public void loginUser() {
        String email = imput("Enter your email");
        String password = imput("Enter your password");
        UserRequestDto userRequestDto=new UserRequestDto(email, password);
        userService.loginUser(userRequestDto);
    }

    public void logoutUser() {
        Long userId=Long.valueOf(imput("Enter id of user to log out"));
        userService.logoutUser(userId);
    }
    public void readUser() {
        Long id = Long.valueOf(imput("Enter id"));
        User user= userService.readUser(id);
        System.out.println(user);
    }


    public void uptadeUser() {
        Long userId=Long.valueOf(imput("Enter id of user that you want to update"));
        String name = imput("Enter your name");
        String email = imput("Enter your email");
        String password = imput("Enter your password");
        User user = new User( name, email, password);
        userService.uptadeUser(userId,user);
    }

    public void deleteUser() {
        Long id = Long.valueOf(imput("Enter id"));
        userService.deleteUser(id);

    }



    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    private String imput(String massage) {
        System.out.println(massage+":");
        return input.nextLine();
    }
}

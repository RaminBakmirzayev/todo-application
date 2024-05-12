import controller.UserController;
import dto.UserRequestDto;
import entity.User;
import repository.UserRepository;
import service.UserService;
import service.impl.UserServiceImpl;

import java.util.Scanner;

public class ToDoApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRepository userRepository = UserRepository.getInstance();
        UserService userServiceImpl = new UserServiceImpl(userRepository);
        UserController userController = new UserController(userServiceImpl);

        while (true) {
            menu();
            int command = scanner.nextInt();
            switch (command) {
                case 1 ->userController.registerUser();
                case 2 ->userController.loginUser();
                case 3 ->userController.readUser();
                case 4 ->userController.getAllUsers();
                case 5->userController.deleteUser();
                case 6->userController.uptadeUser();



            }
        }

    }


    public static void menu() {
        System.out.println("""
                Select one option(1-11)
                1.Register
                2.Login
                3.Get User
                4.Get All Users
                5.Delete User
                6.Update User
                7.Add Task
                8.Uptade Task
                9.Delete Task
                10.Logout
                11.Exit
                          
                """);
    }
}

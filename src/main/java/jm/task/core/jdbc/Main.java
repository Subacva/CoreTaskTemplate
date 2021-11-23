package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Dmitry", "Dabaf", (byte) 28);
        userService.saveUser("Kola", "Vertor", (byte) 14);
        userService.saveUser("Damo", "Chiki", (byte) 59);
        userService.saveUser("Zece", "Cefe", (byte) 42);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}


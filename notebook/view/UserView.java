package view;

import controller.UserController;
import exeptions.Exeption;
import logger.impl.Logging;
import model.User;
import util.Commands;
import logger.Log;
import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;
    private Log log;
    private Exeption exeption;
    private String firstName;
    private String lastName;
    private String phone;

    public UserView(UserController userController) {
        this.userController = userController;
        this.log = new Logging();
        this.exeption = new Exeption();
    }

    private Long promtId() {
        String id = prompt("Users's ID: ");
        Long idLong = null;
        try {
            idLong = Long.valueOf(id);
        } catch (NumberFormatException e) {
            exeption.wrongID(idLong);
        }
        return idLong;
    }

    private void promtFLP() {
        this.firstName = prompt("Name: ");
        this.lastName = prompt("Last name: ");
        this.phone = prompt("Phone number: ");
    }

    public void run() {
        Commands com;
        try {

        } catch (Exception e) {
            exeption.oops();
        }
        while (true) {

            String command = prompt("Enter your command: ");
            try {
                com = Commands.valueOf(command);
                if (com == Commands.EXIT)
                    return;
                switch (com) {
                    case CREATE: {
                        promtFLP();
                        userController.saveUser(new User(firstName, lastName, phone));
                        break;
                    }
                    case READ:
                        try {
                            User user = userController.readUser(promtId());
                            System.out.println(user);
                            System.out.println();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case LIST:
                        List<User> users = userController.getAllUsers();
                        for (User user : users) {
                            System.out.println(user);
                        }
                        break;
                    case UPDATE:
                        Long updateId = promtId();
                        if (updateId == null)
                            break;
                        promtFLP();
                        userController.update(updateId, new User(firstName, lastName, phone));
                        break;
                    case DELETE:
                        Long deleteId = promtId();
                        if (deleteId == null)
                            break;
                        userController.delete(deleteId);
                        break;
                    case NONE:
                        break;
                    default:
                        System.out.println("Enter correct command");
                        log.warning("wrong command: " + command);
                        break;
                }
            } catch (IllegalArgumentException e) {
                exeption.wrongCommand(command);
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String data = in.nextLine();
        log.userEnteredData(data, message);
        // in.close();
        return data;

    }

}

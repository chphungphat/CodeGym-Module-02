package view;

import service.InputService;
import service.UserFileService;
import service.UserService;

public class StartUpView {
    private static final StartUpView startUpView = new StartUpView();

    private StartUpView() {
        UserFileService.getInstance().readUserList();
    }

    public static StartUpView getInstance() {
        return startUpView;
    }

    private final int LOGIN = 1;
    private final int REGISTER = 2;
    private final int EXIT = 3;

    public void displayStartUpMenu() {
        System.out.println("-----------START UP MENU-----------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
    }

    public void runStartUpMenu() {
        displayStartUpMenu();
        int choice = InputService.getInstance().inputChoice();
        switch (choice) {
            case LOGIN -> {
                LoginView.getInstance().displayLoginMenu();
            }
            case REGISTER -> {
                RegisterView.getInstance().displayRegisterMenu();
                runStartUpMenu();
                return;
            }
            case EXIT -> {
                UserFileService.getInstance().writeUserList();
                return;
            }
        }
    }
}

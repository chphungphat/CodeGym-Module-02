package view;

import service.GameFileService;
import service.InputService;
import service.UserFileService;
import service.UserService;

public class StartUpView {
    private static final StartUpView startUpView = new StartUpView();

    private StartUpView() {
        UserFileService.getInstance().readUserList();
        GameFileService.getInstance().readGameList();
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
        int choice = 0;
        while (choice != EXIT) {
            displayStartUpMenu();
            choice = InputService.getInstance().inputChoice();
            switch (choice) {
                case LOGIN -> {
                    if (LoginView.getInstance().displayLoginMenu()) {
                        UserInfoView.getInstance().runUserInfoMenu();
                    }
                }
                case REGISTER -> {
                    RegisterView.getInstance().displayRegisterMenu();
                    CustomerView.getInstance().runCustomerMenu();
                }
                case EXIT -> {
                    UserFileService.getInstance().writeUserList();
                }
                default -> {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}

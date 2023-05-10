package view;

import service.InputService;
import service.UserService;

public class CustomerView {
    private static final CustomerView customerView = new CustomerView();

    private CustomerView() {}

    public static CustomerView getInstance() {
        return customerView;
    }

    private final int USER_INFO = 1;
    private final int ADD_FUND = 2;
    private final int LIBRARY = 3;
    private final int BROWSE_SHOP = 4;
    private final int LOGOUT = 5;

    public void displayCustomerMenu() {
        System.out.println("-----------MAIN MENU-----------");
        System.out.println("1. User info");
        System.out.println("2. Add fund");
        System.out.println("2. Library");
        System.out.println("3. Browse shop");
        System.out.println("4. Logout");
    }

    public void runCustomerMenu() {
        displayCustomerMenu();
        int choice = InputService.getInstance().inputChoice();
        switch (choice) {
            case USER_INFO -> {
                UserService.getInstance().viewUserInfo();

            }
        }
    }
}

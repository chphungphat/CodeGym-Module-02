import entity.Customer;
import entity.User;
import service.UserService;
import view.LoginView;
import view.RegisterView;

public class Main {
    public static void main(String[] args) {
//        LoginView loginView = LoginView.getInstance();
//        UserService userService = UserService.getInstance();
//
//        loginView.displayLoginScreen();
//        System.out.println(userService.getCurrentUser().toString());
        RegisterView registerView = RegisterView.getInstance();
        UserService userService = UserService.getInstance();

        registerView.displayRegisterScreen();
        for (User user : userService.getUserList()) {
            if (user.getName().equals("Admin")) {
                System.out.printf(user.toString());
            } else {
                System.out.printf(((Customer) user).toString());
            }
        }
    }
}
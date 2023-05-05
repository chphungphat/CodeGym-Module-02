import service.UserService;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = LoginView.getInstance();
        UserService userService = UserService.getInstance();

        loginView.displayLoginScreen();
        userService.getCurrentUser().toString();
    }
}
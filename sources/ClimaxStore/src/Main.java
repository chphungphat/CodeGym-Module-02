import service.UserService;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = LoginView.getInstance();
        UserService userService = UserService.getInstance();

        loginView.displayLoginScreen();
        System.out.println(userService.getCurrentUser().toString());

    }
}
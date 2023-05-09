package view;

import builder.CustomerBuilder;
import entity.User;
import service.UserService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class RegisterView {
    private static final RegisterView registerView = new RegisterView();
    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private RegisterView() {}

    public static RegisterView getInstance() {
        return registerView;
    }

    public void displayRegisterScreen() {
        Scanner scanner = new Scanner(System.in);
        CustomerBuilder customerBuilder = new CustomerBuilder();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your birthday: ");
        LocalDate dateBirthDay = null;
        try {
            String birthday = scanner.nextLine();
            dateBirthDay = LocalDate.parse(birthday, FORMATTER);
        } catch (Exception exception) {
            System.err.println("Invalid date");
        }
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        UserService.getInstance().createCustomer(name, phone, password, dateBirthDay, address, email, 0);
    }
}

package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputService {
    private static final InputService inputService = new InputService();
    private final Scanner scanner = new Scanner(System.in);
    private final String NAME_REGEX = "^[a-zA-Z0-9_]{3,20}$";
    private final String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
    private final String PHONE_REGEX = "^\\d{10}$";
    private final String DATE_REGEX = "^(0[1-9]|[12][0-9]|[3][01])/(0[1-9]|1[012])/\\d{4}$";
    private final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    private final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private InputService() {}

    public static InputService getInstance() {
        return inputService;
    }

    public String inputInfo(String typeInfo) {
        String regex = "";
        switch (typeInfo) {
            case "name" -> regex = NAME_REGEX;
            case "email" -> regex = EMAIL_REGEX;
            case "phone" -> regex = PHONE_REGEX;
            case "password" -> regex = PASSWORD_REGEX;
        }
        Pattern pattern = Pattern.compile(regex);
        String text = "";
        while (true) {
            System.out.print("Enter " + typeInfo + ": ");
            text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return text;
            } else {
                System.out.println("Invalid " + typeInfo);
            }
        }
    }

    public String inputName() {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        String text = "";
        while (true) {
            System.out.print("Enter your name: ");
            text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return text;
            } else {
                System.out.println("Invalid name");
            }
        }
    }

    public String inputPhone() {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        String text = "";
        while (true) {
            System.out.print("Enter your phone: ");
            text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return text;
            } else {
                System.out.println("Invalid phone number");
            }
        }
    }

    public String inputEmail() {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        String text = "";
        while (true) {
            System.out.print("Enter your email: ");
            text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return text;
            } else {
                System.out.println("Invalid email");
            }
        }
    }

    public String inputPassword() {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        String text = "";
        while (true) {
            System.out.print("Enter password: ");
            text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return text;
            } else {
                System.out.println("Invalid date");
            }
        }
    }

    public LocalDate inputBirthDate() {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        String text = "";
        while (true) {
            System.out.print("Enter your birthday: ");
            text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                try {
                    return LocalDate.parse(text, DATE_FORMATTER);
                } catch (Exception exception){
                    System.out.println("Invalid date");
                }
            } else {
                System.out.println("Invalid date");
            }
        }
    }




}

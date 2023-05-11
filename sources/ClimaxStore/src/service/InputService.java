package service;

import builder.AddressBuilder;
import entity.Address;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputService {
    private static final InputService inputService = new InputService();
    private final Scanner scanner = new Scanner(System.in);
    private final String NAME_REGEX = "^[a-zA-Z\\s]+";
    private final String EMAIL_REGEX = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
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
        String text;
        Matcher matcher;
        while (true) {
            System.out.print("Enter " + typeInfo + ": ");
            text = scanner.nextLine();
            matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return text;
            } else {
                System.out.println("Invalid " + typeInfo);
            }
        }
    }

    public LocalDate inputBirthDate() {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        String text;
        while (true) {
            System.out.print("Enter your birthday (dd/mm/yyyy): ");
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

    public Address inputAddress() {
        System.out.print("Enter house number: ");
        String number = scanner.nextLine();
        System.out.print("Enter street name: ");
        String street = scanner.nextLine();
        System.out.print("Enter ward: ");
        String ward = scanner.nextLine();
        System.out.print("Enter district: ");
        String district = scanner.nextLine();
        System.out.print("Enter province: ");
        String province = scanner.nextLine();
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        return AddressBuilder.getInstance()
                .number(number)
                .street(street)
                .ward(ward)
                .district(district)
                .province(province)
                .country(country)
                .build();
    }

    public int inputChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }



}

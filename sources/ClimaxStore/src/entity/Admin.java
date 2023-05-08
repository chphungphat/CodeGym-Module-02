package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Admin extends User {
    private static final Admin admin = new Admin(
            "Admin",
            "0867179650",
            "sudo",
            LocalDate.parse("02-01-1998", DateTimeFormatter.ofPattern("dd-LL-yyyy")),
            "219 Lac Long Quan street, ward 3, district 11, HCM city",
            "admin@climax.com"
    );

    private Admin(String name, String phone, String password, LocalDate birthday, String address, String email) {
        super(name, phone, password, birthday, address, email);
    }

    public static Admin getInstance() {
        return admin;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

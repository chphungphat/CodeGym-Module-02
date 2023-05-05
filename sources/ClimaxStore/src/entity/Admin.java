package entity;

public class Admin extends User {
    private static final Admin admin = new Admin(
            0,
            "Admin",
            "0867179650",
            "sudo",
            "admin@climax.com"
    );

    private Admin(int id, String name, String phone, String password, String email) {
        super(id, name, phone,password, email);
    }

    public static Admin getInstance() {
        return admin;
    }

    @Override
    public String toString() {
        return "Admin{" + id +
                ";" + name + '\'' +
                ";" + phone + '\'' +
                ";" + password + '\'' +
                ";" + email + '\'' +
                '}';
    }
}

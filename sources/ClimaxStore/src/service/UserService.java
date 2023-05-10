package service;

import entity.Admin;
import entity.Customer;
import entity.User;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static UserService userService = new UserService();

    private List<User> userList;

    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String notification;
    private User currentUser;

    private UserService() {
        userList = new ArrayList<>();
        userList.add(Admin.getInstance());
    }

    public static UserService getInstance() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    //Read and write binary file
//    public void writeUserList() {
//        try {
//            FileOutputStream fos = new FileOutputStream(USER_FILEPATH);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(userList);
//            oos.close();
//            fos.close();
//        } catch(IOException exception) {
//            System.err.println("Error");
//            exception.printStackTrace();
//        }
//    }
//
//    public List<User> readUserList() {
//        List<User> list = new ArrayList<>();
//        try {
//            FileInputStream fis = new FileInputStream(USER_FILEPATH);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            list = (List<User>) ois.readObject();
//            ois.close();
//            fis.close();
//        } catch(IOException exception) {
//            System.err.println("Error");
//            exception.printStackTrace();
//        } catch (ClassNotFoundException exception) {
//            System.err.println("Class not found");
//            exception.printStackTrace();
//        }
//        return list;
//    }

    public boolean checkUser(String email) {
        notification = "Wrong email or password";
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public boolean checkPassword(String password) {
        if (password.equals(currentUser.getPassword())) {
            notification = "Login successful";
            return true;
        } else {
            currentUser = null;
        }
        return false;
    }

    public void addNewUser(User newUser) {
        userList.add(newUser);
        UserFileService.getInstance().writeUserList();
        currentUser = userList.get(userList.size() - 1);
        System.out.printf("New customer info: \n" + ((Customer) newUser).toString());
        System.out.println();
    }

    public void viewUserInfo() {
        System.out.println("User info:");
        System.out.println(((Customer) currentUser).toString());
    }
}

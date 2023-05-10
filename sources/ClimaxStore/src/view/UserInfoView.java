package view;

public class UserInfoView {
    private static final UserInfoView userInfoView = new UserInfoView();

    private UserInfoView() {}

    public static UserInfoView getInstance() {
        return userInfoView;
    }

    private final int VIEW_INFO = 1;
    private final int UPDATE_INFO = 2;

    public void displayUserInfoMenu() {
        System.out.println("----------USER INFO MENU----------");
        System.out.println("1. View Info");
        System.out.println("2. Update Info");
    }



    public void runUserInfoMenu() {

    }
}

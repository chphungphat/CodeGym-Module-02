package view;

public class UpdateInfoView {
    private static final UpdateInfoView updateInfoNew = new UpdateInfoView();

    private UpdateInfoView() {};

    public static UpdateInfoView getInstance() {
        return updateInfoNew;
    }

    private final int UPDATE_NAME = 1;
    private final int UPDATE_PHONE_NUMBER = 2;
    private final int UPDATE_BIRTHDAY = 3;
    private final int UPDATE_ADDRESS = 4;

    public void displayUpdateInfoMenu() {
        System.out.println("----------UPDATE INFO MENU----------");
        System.out.println("1. Update name");
        System.out.println("2. Update phone number");
        System.out.println("3. Update birthday");
        System.out.println("4. Update address");
    }
}

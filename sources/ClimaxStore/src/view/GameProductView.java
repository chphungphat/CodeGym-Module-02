package view;

import service.GameService;
import service.InputService;

import java.util.List;

public class GameProductView {
    private static final GameProductView gameProductView = new GameProductView();

    private GameProductView() {}

    public static GameProductView getInstance() {
        return gameProductView;
    }

    private final int BUY_GAME = 1;
    private final int VIEW_REVIEW = 2;
    private final int EXIT = 3;

    public void displayGameProductMenu() {
        System.out.println("-------PRODUCT MENU---------");
        System.out.println("1. Buy game");
        System.out.println("2. View reviews");
        System.out.println("3. Exit");
    }

    public void runGameProductMenu() {
        int choice = 0;
        while (choice != EXIT) {
            displayGameProductMenu();
            choice = InputService.getInstance().inputChoice();
            switch (choice) {
                case BUY_GAME -> {

                }
            }
        }


    }
}

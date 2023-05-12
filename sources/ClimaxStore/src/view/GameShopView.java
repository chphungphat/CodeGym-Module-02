package view;

import service.GameFileService;
import service.GameService;
import service.InputService;
import service.UserFileService;

public class GameShopView {
    private static final GameShopView gameShopView = new GameShopView();

    private GameShopView() {}

    public static GameShopView getInstance() {
        return gameShopView;
    }

    private final int BROWSE_GAMES = 1;
    private final int SEARCH_GAMES = 2;
    private final int EXIT = 3;

    public void displayGameShopMenu() {
        System.out.println("---------GAME SHOP MENU---------");
        System.out.println("1. Browse games");
        System.out.println("2. Search games");
        System.out.println("3. Exit");
    }

    public void runGameShopMenu() {
        int choice = 0;
        while (choice != EXIT) {
            displayGameShopMenu();
            choice = InputService.getInstance().inputChoice();
            switch (choice) {
                case BROWSE_GAMES -> {
                    GameService.getInstance().viewGameList();
                    GameService.getInstance().viewGameInfo();
                }
                case EXIT -> {
                    UserFileService.getInstance().writeUserList();
                    GameFileService.getInstance().writeGameList();
                }
                default -> {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}

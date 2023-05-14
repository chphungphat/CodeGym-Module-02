package view;

import service.*;

public class GameShopView {
    private static final GameShopView gameShopView = new GameShopView();

    private GameShopView() {}

    public static GameShopView getInstance() {
        return gameShopView;
    }

    private final int BROWSE_GAMES = 1;
    private final int SEARCH_GAMES = 2;
    private final int VIEW_CART = 3;
    private final int EXIT = 4;

    private final int VIEW_GAME = 1;
    private final int GO_BACK = 2;

    public void displayGameShopMenu() {
        System.out.println("---------GAME SHOP MENU---------");
        System.out.println("1. Browse games");
        System.out.println("2. Search games");
        System.out.println("3. View cart");
        System.out.println("4. Exit");
    }

    public void displayViewGameMenu() {
        System.out.println("1. View a game");
        System.out.println("2. Go back");
    }

    public void runViewGameMenu() {
        int choice = 0;
        while (choice != GO_BACK) {
            displayViewGameMenu();
            choice = InputService.getInstance().inputChoice();
            switch (choice) {
                case VIEW_GAME -> {
                    GameService.getInstance().viewGameList();
                    GameService.getInstance().viewGameInfo();
                    GameProductView.getInstance().runGameProductMenu();
                }
                case GO_BACK -> {
                    LibraryFileService.getInstance().writeLibraryList();
                }
                default -> {
                    System.out.println("Invalid Input");
                }
            }
        }
    }

    public void runGameShopMenu() {
        int choice = 0;
        while (choice != EXIT) {
            displayGameShopMenu();
            choice = InputService.getInstance().inputChoice();
            switch (choice) {
                case BROWSE_GAMES -> {
                    GameService.getInstance().viewGameList();
                    System.out.println();
                    runViewGameMenu();
                }
                case SEARCH_GAMES -> {
                    SearchGameView.getInstance().runSearchMenu();
                }
                case VIEW_CART -> {
                    CartView.getInstance().runCartMenu();
                }
                case EXIT -> {
                    UserFileService.getInstance().writeUserList();
                    LibraryFileService.getInstance().writeLibraryList();
                }
                default -> {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}

package view;

import service.GameService;
import service.InputService;
import service.file_service.LibraryFileService;

public class GameView {
    private static final GameView gameView = new GameView();

    private GameView() {}

    public static GameView getInstance() {
        return gameView;
    }

    private final int VIEW_GAME = 1;
    private final int GO_BACK = 2;

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
                    GameService.getInstance().viewGameInfo();
                    GameProductView.getInstance().runGameProductMenu();
                    System.out.println();
                }
                case GO_BACK -> {
                    LibraryFileService.getInstance().writeLibraryList();
                }
                default -> {
                    System.out.println("Invalid Input");
                }
            }
            GameService.getInstance().viewGameList();
        }
    }
}

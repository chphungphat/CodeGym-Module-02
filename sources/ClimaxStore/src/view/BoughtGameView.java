package view;

import service.InputService;
import service.LibraryService;
import service.ReviewFileService;
import service.ReviewService;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class BoughtGameView {
    private static final BoughtGameView boughtGameView = new BoughtGameView();

    private BoughtGameView() {}

    public static BoughtGameView getInstance() {
        return boughtGameView;
    }

    private final int VIEW_GAME_INFO = 1;
    private final int WRITE_REVIEW = 2;
    private final int GO_BACK = 3;

    public void displayBoughtGameMenu() {
        System.out.println("1. View game info");
        System.out.println("2. Write review");
        System.out.println("3. Go back");
    }

    public void runBoughtGameMenu() {
        int choice = 0;
        while (choice != GO_BACK) {
            displayBoughtGameMenu();
            choice = InputService.getInstance().inputChoice();
            switch (choice) {
                case VIEW_GAME_INFO -> {
                    LibraryService.getInstance().viewBoughtGameInfo();
                }
                case WRITE_REVIEW -> {
                    ReviewService.getInstance().chooseGameToReview(LibraryService.getInstance().getCurrentLibrary().getGameList());
                    ReviewFileService.getInstance().writeReviewList();
                }
                default -> {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}

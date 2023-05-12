package service;

import entity.Game;

import java.util.ArrayList;
import java.util.List;

public class GameService {
    private static final GameService gameService = new GameService();

    private GameService() {
        gameList = new ArrayList<>();
    }

    public static GameService getInstance() {
        return gameService;
    }

    private List<Game> gameList;
    private Game currentGame;

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }

    public Game getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(Game currentGame) {
        this.currentGame = currentGame;
    }

    public void addNewGame(Game newGame) {
        gameList.add(newGame);
        currentGame = gameList.get(gameList.size()- 1);
        System.out.println("New Game info: \n" + newGame.toString());
        System.out.println();
    }

    public void viewGameList() {
        for (Game game : gameList) {
            System.out.println(game.getId() + ". " + game.getName());
        }
    }

    public void viewGameInfo() {
        System.out.println("Choose game you want to view:");
        int choice;
        while (true) {
            choice = InputService.getInstance().inputChoice();
            if (choice < 0 || choice >= gameList.size()) {
                System.out.println("Invalid input");
            } else {
                break;
            }
        }
        currentGame = gameList.get(choice);
        System.out.println("Game info: ");
        System.out.println(currentGame.toString());
    }

}

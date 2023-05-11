package service;

import entity.Game;

public class GameService {
    private static final GameService gameService = new GameService();

    private GameService() {}

    public static GameService getInstance() {
        return gameService;
    }
}

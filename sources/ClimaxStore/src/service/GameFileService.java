package service;

public class GameFileService {
    private static final GameFileService gameFileService = new GameFileService();

    private GameFileService() {}

    public static GameFileService getInstance() {
        return gameFileService;
    }


}

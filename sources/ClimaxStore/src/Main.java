import entity.Game;
import service.GameFileService;
import service.GameService;
import view.StartUpView;

public class Main {
    public static void main(String[] args) {
        StartUpView.getInstance().runStartUpMenu();
//        GameFileService.getInstance().readGameList();
//        for (Game game : GameService.getInstance().getGameList()) {
//            System.out.println(game.toString());
//        }
    }
}
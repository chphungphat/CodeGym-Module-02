package service;

import entity.Game;
import entity.Library;

import java.util.List;

public class LibraryService {
    private static final LibraryService libraryService = new LibraryService();

    private LibraryService() {}

    public static LibraryService getInstance() {
        return libraryService;
    }

    private List<Library> libraryList;
    private Library currentLibrary;

    public List<Library> getLibraryList() {
        return libraryList;
    }

    public void setLibraryList(List<Library> libraryList) {
        this.libraryList = libraryList;
    }

    public Library getCurrentLibrary() {
        return currentLibrary;
    }

    public void setCurrentLibrary(Library currentLibrary) {
        this.currentLibrary = currentLibrary;
    }

    public String printGame(int id) {
        String text = "Game not found";
        for (Game game : GameService.getInstance().getGameList()) {
            if (game.getId() == id) {
                text = id + ". " + game.getName();
            }
        }
        return text;
    }

    public void printBoughtGame() {
        System.out.println("List of bought games: ");
        for (int id : currentLibrary.getGameList()) {
            System.out.println(printGame(id));
        }
    }

    public void printWishList() {
        System.out.println("Wish List: ");
        for (int id : currentLibrary.getGameList()) {
            System.out.println(printGame(id));
        }
    }

    public boolean isGameInWishList(int id) {
        for (int gameID : currentLibrary.getWishList()) {
            if (id == gameID) {
                return true;
            }
        }
        return false;
    }

    public void addGameToLibrary(List<Integer> gameIDList) {
        for (int id : gameIDList) {
            if (isGameInWishList(id)) {
                currentLibrary.getWishList().remove(currentLibrary.getWishList().indexOf(id));
            }
            currentLibrary.getGameList().add(id);
        }
        System.out.println("Games added to your library: ");
        for (int id : gameIDList) {
            System.out.println(GameService.getInstance().viewGameByID(id));
        }
    }

    public boolean isAddableToWishList(int id) {
        for (int gameID : currentLibrary.getGameList()) {
            if (gameID == id) {
                System.out.println("Game already bought");
                return false;
            }
        }
        for (int gameID : currentLibrary.getWishList()) {
            if (gameID == id) {
                System.out.println("Game already in wish list");
                return false;
            }
        }
        return true;
    }

    public void addGameToWishList() {
        int id = GameService.getInstance().getCurrentGame().getId();
        if (isAddableToWishList(id)) {
            currentLibrary.getWishList().add(id);
            System.out.println("Game added to library");
        }
    }

    public void removeGameFromWishList(int id) {
        if (isGameInWishList(id)) {
            currentLibrary.getWishList().remove(currentLibrary.getWishList().indexOf(id));
            System.out.println("Game removed from wish list");
        } else {
            System.out.println("Game not found im wish list");
        }
    }
}

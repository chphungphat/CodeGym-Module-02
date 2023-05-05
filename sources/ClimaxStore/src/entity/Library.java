package entity;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<BoughtGame> gameList;
    private List<Game> wishList;

    public Library(List<BoughtGame> gameList, List<Game> wishList) {
        this.gameList = gameList;
        this.wishList = wishList;
    }

    public Library() {
        gameList = new ArrayList<BoughtGame>();
        wishList = new ArrayList<Game>();
    }

    public List<BoughtGame> getGameList() {
        return gameList;
    }

    public void setGameList(List<BoughtGame> gameList) {
        this.gameList = gameList;
    }

    public List<Game> getWishList() {
        return wishList;
    }

    public void setWishList(List<Game> wishList) {
        this.wishList = wishList;
    }

    public String printGameList() {
        String text = "";
        for (Game element : gameList) {
            text += element.getName() + "\n";
        }
        return text;
    }

    public String printWishList() {
        String text = "";
        for (Game element : wishList) {
            text += element.getName() + "\n";
        }
        return text;
    }
}

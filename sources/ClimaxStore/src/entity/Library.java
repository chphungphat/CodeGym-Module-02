package entity;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private static int count = 0;

    private int id;
    private List<Integer> gameList;
    private List<Integer> wishList;

    public Library(List<Integer> gameList, List<Integer> wishList) {
        this.id = count++;
        this.gameList = gameList;
        this.wishList = wishList;
    }

    public Library() {
        this.id = count++;
        gameList = new ArrayList<>();
        wishList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getGameList() {
        return gameList;
    }

    public void setGameList(List<Integer> gameList) {
        this.gameList = gameList;
    }

    public List<Integer> getWishList() {
        return wishList;
    }

    public void setWishList(List<Integer> wishList) {
        this.wishList = wishList;
    }
}

package entity;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private int id;
    private List<Integer> gameList;
    private List<Integer> wishList;

    public Library(int id, List<Integer> gameList, List<Integer> wishList) {
        this.id = id;
        this.gameList = gameList;
        this.wishList = wishList;
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

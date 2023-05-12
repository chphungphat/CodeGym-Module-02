package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Integer> gameCart;

    private Cart() {
        gameCart = new ArrayList<>();
    }

    public Cart(List<Integer> gameCart) {
        this.gameCart = gameCart;
    }

    public List<Integer> getGameCart() {
        return gameCart;
    }

    public void setGameCart(List<Integer> gameCart) {
        this.gameCart = gameCart;
    }
}

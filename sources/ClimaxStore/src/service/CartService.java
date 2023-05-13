package service;

import entity.Cart;
import entity.Customer;
import entity.Game;

import java.util.List;

public class CartService {
    private static final CartService cartService = new CartService();

    private CartService () {}

    public static CartService getInstance() {
        return cartService;
    }

    private Cart currentCart;
    private List<Cart> cartList;

    public Cart getCurrentCart() {
        return currentCart;
    }

    public void setCurrentCart(Cart currentCart) {
        this.currentCart = currentCart;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }

    public boolean checkIsPurchasable(int id) {
        for (int gameID : currentCart.getGameCart()) {
            if (gameID == id) {
                System.out.println("Game already in cart");
                return false;
            }
        }
        for (int gameID : LibraryService.getInstance().getCurrentLibrary().getGameList()) {
            if (gameID == id) {
                System.out.println("Game already in library");
                return false;
            }
        }
        return true;
    }

    public void printCart() {
        System.out.println("Current Cart:");
        for (int id : currentCart.getGameCart()) {
            System.out.println(GameService.getInstance().viewGameByID(id));
        }
    }

    public void addToCart(int id) {
        if (checkIsPurchasable(id)) {
            currentCart.getGameCart().add(id);
            printCart();
        }
    }

    public void removeFromCart(int id) {
        for (int gameID : currentCart.getGameCart()) {
            if (gameID == id) {
                int index = currentCart.getGameCart().indexOf(id);
                currentCart.getGameCart().remove(index);
                System.out.println("Removed");
                printCart();
                return;
            }
        }
        System.out.println("Game not in cart");
    }

    public void checkOut() {
        long totalAmount = 0;
        for (int id : currentCart.getGameCart()) {
            for (Game game : GameService.getInstance().getGameList()) {
                if (id == game.getId()) {
                    totalAmount += game.getPrice();
                    break;
                }
            }
        }
        System.out.println("Total amount is: " + totalAmount);
        if (totalAmount <= ((Customer) UserService.getInstance().getCurrentUser()).getWallet()) {
            LibraryService.getInstance().addGameToLibrary(currentCart.getGameCart());
            System.out.println("Checkout successfully");
        } else {
            System.out.println("Not enough money");
        }
    }
}

package service;

import entity.Cart;
import entity.Customer;
import entity.Game;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    private static final CartService cartService = new CartService();

    private CartService () {
        cartList = new ArrayList<>();
    }

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
            if (id != 0) {
                System.out.println(GameService.getInstance().viewGameByID(id));
            }
        }
    }

    public void addToCart() {
        int id = GameService.getInstance().getCurrentGame().getId();
        if (checkIsPurchasable(id)) {
            currentCart.getGameCart().add(id);
            System.out.println("add to cart successfully");
            printCart();
        }
    }

    public void removeFromCart(int id) {
        for (int gameID : currentCart.getGameCart()) {
            if (gameID != 0) {
                if (gameID == id) {
                    int index = currentCart.getGameCart().indexOf(id);
                    currentCart.getGameCart().remove(index);
                    System.out.println("Removed");
                    return;
                }
            }
        }
        System.out.println("Game not in cart");
    }

    public void removeAGameFromCart() {
        System.out.println("Choose a game to remove from cart");
        int choice = InputService.getInstance().inputChoice();
        removeFromCart(choice);

    }

    public void checkOut() {
        long totalAmount = 0;
        for (int id : currentCart.getGameCart()) {
            if (id != 0) {
                for (Game game : GameService.getInstance().getGameList()) {
                    if (id == game.getId()) {
                        totalAmount += game.getPrice();
                        break;
                    }
                }
            }
        }
        System.out.println("Total amount is: " + totalAmount);
        if (totalAmount <= ((Customer) UserService.getInstance().getCurrentUser()).getWallet()) {
            LibraryService.getInstance().addGameToLibrary(currentCart.getGameCart());
            System.out.println("Checkout successfully");
            FundService.getInstance().subtractFund(totalAmount);

            //Empty current cart
            Cart emptyCart = new Cart();
            emptyCart.setId(currentCart.getId());
            currentCart = emptyCart;
            cartList.set(currentCart.getId() - 1, emptyCart);
        } else {
            System.out.println("Not enough money");
        }
    }

    public Cart toCart(String[] data) {
        List<Integer> newCart = new ArrayList<>();
        for (String element : data) {
            newCart.add(Integer.parseInt(element));
        }
        return new Cart(newCart);
    }

    public void createNewCart() {
        Cart newCart = new Cart();
        cartList.add(newCart);
        currentCart = cartList.get(cartList.size() - 1);
    }

    public void addToCartByChoice(List<Integer> gameID) {
        System.out.println("Select a game to add to cart");
        int id;
        while (true) {
            id = InputService.getInstance().inputChoice();
            if (gameID.contains(id)) {
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
        GameService.getInstance().setCurrentGame(GameService.getInstance().getGameList().get(id - 1));
        addToCart();
    }
}

package service;

public class CartService {
    private static final CartService cartService = new CartService();

    private CartService () {}

    public static CartService getInstance() {
        return cartService;
    }


}

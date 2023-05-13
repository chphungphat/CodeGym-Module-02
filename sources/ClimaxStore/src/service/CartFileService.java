package service;

public class CartFileService {
    private static final CartFileService cartFileService = new CartFileService();

    private CartFileService() {}

    public static CartFileService getInstance() {
        return cartFileService;
    }

    private final String CART_FILEPATH = "src//data//cart.csv";
}

package view;

import service.CartFileService;
import service.CartService;
import service.InputService;
import service.LibraryFileService;

public class CartView {
    private static final CartView cartView = new CartView();

    private CartView() {}

    public static CartView getInstance() {
        return cartView;
    }

    private final int CHECK_OUT = 1;
    private final int REMOVE_FROM_CART = 2;
    private final int GO_BACK = 3;

    public void displayCartMenu() {
        System.out.println("---------CART MENU-----------");
        System.out.println("1. Check out");
        System.out.println("2. Remove a game from cart");
        System.out.println("3. Go back");
    }

    public void runCartMenu() {
        System.out.println("Current Cart: ");
        CartService.getInstance().printCart();
        int choice = 0;
        while ((choice != GO_BACK) || (CartService.getInstance().getCurrentCart().getGameCart().size() != 1)) {
            displayCartMenu();
            choice = InputService.getInstance().inputChoice();
            switch (choice) {
                case CHECK_OUT -> {
                    CartService.getInstance().checkOut();
                    CartFileService.getInstance().writeCartList();
                    LibraryFileService.getInstance().writeLibraryList();
                }
                case REMOVE_FROM_CART -> {
                    CartService.getInstance().removeAGameFromCart();
                    if (CartService.getInstance().getCurrentCart().getGameCart().size() == 1) {
                        System.out.println("Cart is empty");
                    }
                    CartFileService.getInstance().writeCartList();
                }
                case GO_BACK -> {
                    CartFileService.getInstance().writeCartList();
                }
                default -> {
                    System.out.println("Invalid input");
                }
            }
        }
        System.out.println();
    }
}

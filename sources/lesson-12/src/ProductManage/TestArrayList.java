package ProductManage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
    private static Product p1 = new Product(1, "Nintendo Switch", 400);
    private static Product p2 = new Product(2, "Xbox One", 800);
    private static Product p3 = new Product(3, "Playstation 5", 900);
    private static Product p4 = new Product(4, "Steam Deck", 600);
    private static Product p5 = new Product(5, "PC", 1000);

    private static void addToList(ProductManagerArrayList productList) {
        productList.addProduct(p1);
        productList.addProduct(p2);
        productList.addProduct(p3);
        productList.addProduct(p4);
        productList.addProduct(p5);
    }

    public static void main(String[] args) {
        ProductManagerArrayList productList = new ProductManagerArrayList();
        addToList(productList);
        productList.printList();

        productList.updateProduct(10);
        productList.updateProduct(3);
        productList.printList();

        productList.removeProduct(10);
        productList.removeProduct(2);
        productList.printList();

        ProductPriceComparator priceComparator = new ProductPriceComparator();
        Collections.sort(productList.getProducts(), priceComparator);
        productList.printList();
    }
}

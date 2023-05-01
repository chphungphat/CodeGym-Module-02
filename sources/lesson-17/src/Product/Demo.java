package Product;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String filePath = "src/Product/product.txt";
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "Nintendo Switch", 3000, "Nintendo", "Console"));
        productList.add(new Product(2, "Playstation 5", 3500, "Sony", "Console"));
        productList.add(new Product(3, "Xbox One", 3500, "Microsoft", "Console"));
        productList.add(new Product(4, "Steam Deck", 4000, "Vavle", "Mini PC"));

        ReadAndWrite readAndWrite = new ReadAndWrite();
        readAndWrite.writeProduct(filePath, productList);

        List<Product> list = readAndWrite.readProduct(filePath);
        for (Product element : list) {
            System.out.println(element.toString());
        }
    }
}

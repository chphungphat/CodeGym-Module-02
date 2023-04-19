package ProductManage;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ProductManagerLinkedList {
    private final static int NOT_FOUND = -1;
    private LinkedList<Product> products;

    public ProductManagerLinkedList(LinkedList<Product> products) {
        this.products = products;
    }

    public ProductManagerLinkedList() {
        products = new LinkedList<Product>();
    }

    public LinkedList<Product> getProducts() {
        return products;
    }

    public void setProducts(LinkedList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        if (products.contains(p)) {
            System.out.println("Product already exist");
        } else {
            products.add(p);
        }

    }

    public void addProduct(int id, String name, int price) {
        Product p = new Product(id, name, price);
        addProduct(p);
    }

    public int checkExist(int id) {
        int index = NOT_FOUND;
        for (int count = 0; count < products.size(); count++) {
            if (products.get(count).getId() == id) {
                index = count;
                return index;
            }
        }
        return index;
    }

    public void removeProduct(int id) {
        if (checkExist(id) != NOT_FOUND) {
            products.remove(checkExist(id));
        } else {
            System.out.println("Product not found");
        }
    }

    public void updateProduct(int id) {
        int index = checkExist(id);
        if (index == NOT_FOUND) {
            System.out.println("Product not found");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product's name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter product's price: ");
            int newPrice = scanner.nextInt();
            products.get(index).setName(newName);
            products.get(index).setPrice(newPrice);
        }
    }

    public void printList() {
        System.out.println("List of products:");
        for (Product element : products) {
            System.out.println(element.toString());
        }
    }
}

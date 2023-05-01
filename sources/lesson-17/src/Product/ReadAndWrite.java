package Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public void writeProduct(String filePath, List<Product> product) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public List<Product> readProduct(String filePath) {
        List<Product> products = new ArrayList<Product>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return products;
    }
}

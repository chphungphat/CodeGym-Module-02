package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyWriter {
    public static void copyWrite(String src, String des) {
        FileInputStream fis;
        FileOutputStream fos;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(des);

            byte[] buffer = new byte[1024];
            int numbByte = 0;

            while ((numbByte = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, numbByte);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        } catch (IOException exception) {
            System.out.println("Copy error");
        }
    }
}

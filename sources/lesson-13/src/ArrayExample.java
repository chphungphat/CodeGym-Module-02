import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Element in array: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
//        Integer[] arr = null;
        Integer[] arr = arrExample.createRandom();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Element at " + index + " is: " + arr[index]);
        } catch (IndexOutOfBoundsException indexException) {
            System.out.println("Index exceed array length");
        } catch (Exception exception) {
            System.out.println("Runtime error");
        }
    }
}

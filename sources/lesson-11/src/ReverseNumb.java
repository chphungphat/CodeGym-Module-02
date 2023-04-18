import  GenericStack.MyGenericStack;

import java.util.Scanner;

public class ReverseNumb {
    private static int[] intArray;

    private static void inPutArr() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n =  scan.nextInt();
        intArray = new int[n];
        for (int index = 0; index < n; index++) {
            System.out.print("Enter " + index + " element: ");
            intArray[index] = scan.nextInt();
        }
    }

    private static void reverseArr(MyGenericStack<Integer> stack) {
        for (int element : intArray) {
            stack.push(element);
        }
        System.out.println("Reversed array:");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        MyGenericStack<Integer> integerMyGenericStack = new MyGenericStack<Integer>();
        inPutArr();
        reverseArr(integerMyGenericStack);
    }
}

import GenericStack.MyGenericStack;

public class ReverseString {
    private static final String mWord = "I AM THE WORLD";

    private static void pushToStack(MyGenericStack<String> stack) {
        String[] mChar = mWord.split(" ");
        for (String element : mChar) {
            stack.push(element);
        }
    }

    private static void reverseString(MyGenericStack<String> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(mWord);
        MyGenericStack<String> stringMyGenericStack = new MyGenericStack<String>();
        pushToStack(stringMyGenericStack);
        reverseString(stringMyGenericStack);
    }
}

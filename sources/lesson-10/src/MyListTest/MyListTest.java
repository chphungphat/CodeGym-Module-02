package MyListTest;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        for (int element = 0; element < 5; element++) {
            listInteger.add(element);
        }

        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(1));
        System.out.println(listInteger.get(2));
        System.out.println(listInteger.get(3));
        System.out.println(listInteger.get(-1));
    }
}

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr);
    }
}

public class Main{
    public static void main(String args[]) {
        Comparator comparator = new MyComparator();
        TreeSet<String> ts = new TreeSet<String>(comparator);

        ts.add("java2s.com");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts)
            System.out.print(element);

        System.out.println();
    }
}
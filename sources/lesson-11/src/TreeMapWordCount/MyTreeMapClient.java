package TreeMapWordCount;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class MyTreeMapClient {

    private static final String para = "The boy walked down the street in a carefree way, playing without notice of what was about him. He didn't hear the sound of the car as his ball careened into the road. He took a step toward it, and in doing so sealed his fate.";

    private static String removePunctuations(String str) {
        return str.replaceAll("\\p{Punct}", "");
    }

    private static String[] spliceString(String str) {
        return str.split(" ");
    }

    public static void main(String[] args) {
        String str = removePunctuations(para);
        String[] strArray = spliceString(str);

        MyTreeMap myTreeMap = new MyTreeMap();
        for (String element : strArray) {
            myTreeMap.putToTree(element);
        }
        myTreeMap.printTree();
        myTreeMap.toCaps();
        System.out.println();
        myTreeMap.printTree();
    }
}

package TreeMapWordCount;

import java.util.Set;
import java.util.TreeMap;

public class MyTreeMap extends TreeMap<String, Integer> {


    public MyTreeMap() {
    }

    public void putToTree(String key) {
        if (!(this.containsKey(key)) || this == null) {
            this.put(key, 1);
        } else {
            Integer temp = this.get(key) + 1;
            this.remove(key);
            this.put(key, temp);
        }
    }

    public void toCaps() {
        Set<String> keySet = this.keySet();
        String[] str = new String[keySet.size()];
        str = keySet.toArray(str);
        for (int index = 0; index < str.length; index++) {
            String capKey = str[index];
            capKey = capKey.toUpperCase();
            int temp = this.get(str[index]);
            this.remove(str[index]);
            this.put(capKey, temp);
        }
    }

    public void printTree() {
        Set<String> keySet = this.keySet();
        for (String key : keySet) {
            int value = this.get(key);
            System.out.println(String.format("%s : %d", key, value));
        }
    }
}

package TreeMapWordCount;

import javax.swing.plaf.PanelUI;

public class TreeNode implements Comparable<TreeNode> {
    private String key;
    private int value;

    public TreeNode(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public TreeNode() {
        key = null;
        value = 0;
    }

    public TreeNode(String key) {
        this.key = key;
        this.value = 0;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEqualKey(TreeNode node) {
        return this.key == node.key;
    }

    @Override
    public int compareTo(TreeNode node) {
        return this.key.compareTo(node.key);
    }
}

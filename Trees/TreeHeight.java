package Trees;

public class TreeHeight extends Node{

    public TreeHeight(int val) {
        super(val);
    }

    public int height(Node root) {
        if (root == null) {
            return -1;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }
}

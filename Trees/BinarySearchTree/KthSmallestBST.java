package BinarySearchTree;

import java.util.Stack;

public class KthSmallestBST {

    public int kthSmallest(Node root, int k) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;

            if (count == k) {
                return current.val;
            }

            current = current.right;
        }

        throw new IllegalArgumentException();
    }
}

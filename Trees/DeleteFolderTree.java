package Trees;


public class DeleteFolderTree extends Node {

    public DeleteFolderTree(int val) {
        super(val);
    }

    public void deleteFolderTree(Node root) {
        if (root == null) {
            return;
        }

        deleteFolderTree(root.left);
        deleteFolderTree(root.right);
        deleteNode(root);
    }

    private void deleteNode(Node node) {
    }
}

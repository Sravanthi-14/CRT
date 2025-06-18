class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
public class BinaryTree {

    TreeNode root;

    // Inorder traversal: Left -> Root -> Right
    void inorder(TreeNode node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder traversal: Left -> Right -> Root
    void postorder(TreeNode node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually creating a tree for example
        //         1
        //       /   \
        //     2       3
        //    / \     / 
        //   4   5   6

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root); // Output: 4 2 5 1 6 3

        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root); // Output: 4 5 2 6 3 1
    }
}

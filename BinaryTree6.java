public class BinaryTree6 {

    // Tree Node class
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // 1. Count non-leaf nodes (nodes with at least one child)
    public static int countNonLeafNodes(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
    }

    // 2. Search for an element in the tree
    public static boolean searchElement(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return searchElement(root.left, key) || searchElement(root.right, key);
    }

    // 3. Mirror the tree (swap left and right children)
    public static void mirrorTree(Node root) {
        if (root == null) return;

        // Swap left and right
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively mirror left and right subtrees
        mirrorTree(root.left);
        mirrorTree(root.right);
    }

    // Helper to do Inorder traversal (for testing)
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        // Create sample tree
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        // Count non-leaf nodes
        System.out.println("Non-leaf nodes count: " + countNonLeafNodes(root));

        // Search for an element
        int searchKey = 50;
        System.out.println("Is " + searchKey + " in the tree? " + searchElement(root, searchKey));

        // Inorder before mirroring
        System.out.print("Inorder before mirror: ");
        inorderTraversal(root);
        System.out.println();

        // Mirror the tree
        mirrorTree(root);

        // Inorder after mirroring
        System.out.print("Inorder after mirror: ");
        inorderTraversal(root);
    }
}

public class BinaryTree5 {

    // Tree node class
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Method to count non-leaf nodes
    public static int countNonLeafNodes(Node root) {
        // Base case: if node is null or a leaf node, return 0
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }

        // Node is non-leaf, count it and recurse for children
        return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int result = countNonLeafNodes(root);
        System.out.println("Non-leaf nodes count: " + result);
    }
}

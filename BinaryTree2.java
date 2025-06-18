class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree2 {
    Node root;

    public BinaryTree2() {
        root = null;
    }

    // Method to count leaf nodes
    public int countLeafNodes(Node node) {
        if (node == null) {
            return 0; // Base case: empty tree has 0 leaf nodes
        }
        if (node.left == null && node.right == null) {
            return 1; // Base case: leaf node found
        } else {
            // Recursive step: count leaf nodes in left and right subtrees
            return countLeafNodes(node.left) + countLeafNodes(node.right);
        }
    }

    // Helper method to start counting from the root
    public int getLeafCount() {
        return countLeafNodes(root);
    }

    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int leafCount = tree.getLeafCount();
        System.out.println("Number of leaf nodes: " + leafCount); // Output: 3
    }
}
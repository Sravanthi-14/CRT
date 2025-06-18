class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree4 {
    Node root;

    // Recursive function to find the maximum value in the binary tree
    int findMax(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE; // Base case: return minimum integer value for empty tree
        }

        int res = node.data; // Initialize result with current node's data
        int leftRes = findMax(node.left); // Recursively find max in left subtree
        int rightRes = findMax(node.right); // Recursively find max in right subtree

        // Update result if left or right subtree max is greater
        if (leftRes > res) {
            res = leftRes;
        }
        if (rightRes > res) {
            res = rightRes;
        }
        return res; // Return the maximum value found
    }

    public static void main(String[] args) {
        BinaryTree4 tree = new BinaryTree4();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        System.out.println("Maximum element is " + tree.findMax(tree.root));
    }
}
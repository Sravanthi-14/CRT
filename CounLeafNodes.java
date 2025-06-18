int countLeafNodes(TreeNode node) {
    if (node == null)
        return 0;

    // If both left and right are null, this is a leaf node
    if (node.left == null && node.right == null)
        return 1;

    // Otherwise, sum the leaf counts of left and right subtrees
    return countLeafNodes(node.left) + countLeafNodes(node.right);
}
public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    // Sample tree:
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

    int leafCount = tree.countLeafNodes(tree.root);
    System.out.println("Number of leaf nodes: " + leafCount); // Output: 3
}

class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
def mirror_tree(root):
    if root is None:
        return None
    left_mirror = mirror_tree(root.left)
    right_mirror = mirror_tree(root.right)
    root.left = right_mirror
    root.right = left_mirror
    return root
def inorder(root):
    if root is None:
        return
    inorder(root.left)
    print(root.data, end=" ")
    inorder(root.right)
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
print("Original inorder:")
inorder(root)  # Output: 4 2 5 1 3
mirror_tree(root)
print("\nMirrored inorder:")
inorder(root)  # Output: 3 1 5 2 4

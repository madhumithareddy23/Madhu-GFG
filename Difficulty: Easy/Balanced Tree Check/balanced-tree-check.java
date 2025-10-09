/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    // Helper function to check height and balance simultaneously
    private int checkHeight(Node root) {
        if (root == null) return 0;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1;  // left subtree not balanced

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1; // right subtree not balanced

        // if difference in height > 1, it's unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        // return height of current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if(root == null) return new TreeNode(node.val);
        if(node.val < root.val) {
            root.left = insertNode(root.left, node);
        } else if(node.val > root.val) {
            root.right = insertNode(root.right, node);
        } else {
            root.val = node.val;
        }

        return root;
    }
}
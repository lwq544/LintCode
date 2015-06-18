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
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        int ld, rd;
        if(root!=null) {
            ld = maxDepth(root.left);
            rd = maxDepth(root.right);
            return (ld>rd?ld:rd) + 1;
        } else {
            return 0;
        }
    }
}

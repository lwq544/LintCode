package Flatten;

/**
 * Created by Silocean on 2016-04-08.
 */
public class Flatten {

    private static TreeNode node = null;

    public static void main(String[] args) {

    }

    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (node != null) {
            node.left = null;
            node.right = root;
        }
        node = root;
        TreeNode right = root.right; // 注意保存下二叉树的右孩子
        flatten(root.left);
        flatten(right);
    }


}

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
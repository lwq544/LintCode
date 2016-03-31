package BuildTree;

import java.util.Arrays;

/**
 * 前序遍历和中序遍历树构造二叉树
 * Created by Silocean on 2016-03-30.
 */
public class BuildTree {

    public static void main(String[] args) {
        int[] preorder = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] inorder = {3, 2, 5, 4, 6, 1, 7, 8};
        TreeNode root = buildTree(preorder, inorder);
        // System.out.println(root.left.val);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int temp = 0;
        for (int j = 0; j < inorder.length; j++) {
            if (preorder[0] == inorder[j]) temp = j;
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, temp + 1),
                Arrays.copyOfRange(inorder, 0, temp));
        root.right = buildTree(Arrays.copyOfRange(preorder, temp + 1, preorder.length),
                Arrays.copyOfRange(inorder, temp + 1, inorder.length));
        return root;
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
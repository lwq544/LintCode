package BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silocean on 2016-04-04.
 */
public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.right = new TreeNode(5);
        List<String> result = binaryTreePaths(a);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public static List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        ArrayList<String> result = new ArrayList<>();
        helper(result, root, "");
        return result;
    }

    private static void helper(ArrayList<String> result, TreeNode root, String str) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            str += root.val;
            result.add(str);
        } else {
            str += root.val + "->";
            if (root.left != null) {
                helper(result, root.left, str);
            }
            if (root.right != null) {
                helper(result, root.right, str);
            }
        }
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

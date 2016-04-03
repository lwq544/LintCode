package MinDepth;

/**
 * Created by Silocean on 2016-04-03.
 */
public class MinDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(minDepth(root));
    }

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public static int minDepth(TreeNode root) {
        // write your code here
        int ld, rd;
        if (root != null) {
            ld = minDepth(root.left);
            rd = minDepth(root.right);
            if (ld == 0) {
                return rd + 1;
            }
            if (rd == 0) {
                return ld + 1;
            }
            return (ld < rd ? ld : rd) + 1;
        } else {
            return 0;
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
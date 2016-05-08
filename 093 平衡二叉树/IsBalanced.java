package IsBalanced;

/**
 * Created by Silocean on 2016-05-08.
 */
public class IsBalanced {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        //a.left = new TreeNode(9);
        a.right = new TreeNode(20);
        a.right.left = new TreeNode(15);
        //a.right.right = new TreeNode(7);
        System.out.println(isBalanced(a));
    }

    public static boolean isBalanced(TreeNode root) {
        // write your code here
        return getDepth(root) != -1;
    }

    public static int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return (left >= right ? left : right) + 1;
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
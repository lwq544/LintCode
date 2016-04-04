package IsIdentical;

/**
 * Created by Silocean on 2016-04-04.
 */
public class IsIdentical {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);

        TreeNode b = new TreeNode(1);
        b.left = new TreeNode(2);
        b.right = new TreeNode(3);
        b.left.right = new TreeNode(4);

        System.out.println(isIdentical(a, b));
    }

    public static boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        if (a == null && b == null) return true;
        if (a == null || b == null) {
            return false;
        }

        if (a.val != b.val) return false;

        return isIdentical(a.left, b.left) &&
                isIdentical(a.right, b.right);
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
package IsSubtree;

/**
 * Created by Silocean on 2016-03-31.
 */
public class IsSubtree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        a.left = b;
        a.right = c;
        // b.right = d;

        TreeNode a1 = new TreeNode(1);
        TreeNode b1 = new TreeNode(2);
        TreeNode c1 = new TreeNode(3);
        TreeNode d1 = new TreeNode(4);
        a1.left = b1;
        a1.right = c1;
        // b1.left = d1;

        System.out.println(isSubtree(a, a1));
    }

    public static boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here
        if (T2 == null) return true;
        if (T1 == null) return false;
        if (isSame(T1, T2)) return true;
        if (isSubtree(T1.left, T2) || isSubtree(T1.right, T2)) return true;
        return false;
    }

    public static boolean isSame(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == t2;
        } else if (t1.val != t2.val) {
            return false;
        } else {
            return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
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
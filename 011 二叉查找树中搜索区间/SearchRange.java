package SearchRange;

import java.util.ArrayList;

/**
 * Created by Silocean on 2016-05-16.
 */
public class SearchRange {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(20);
        a.left = new TreeNode(8);
        a.right = new TreeNode(22);
        a.left.left = new TreeNode(4);
        a.left.right = new TreeNode(12);
        ArrayList<Integer> list = searchRange(a, 10, 22);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    /**
     * @param root: The root of the binary search tree.
     * @param k1    and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    public static ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        keys(root, list, k1, k2);
        return list;
    }

    private static void keys(TreeNode x, ArrayList<Integer> list, int lo, int hi) {
        if (x == null) return;
        if (lo < x.val) {
            keys(x.left, list, lo, hi);
        }
        if (lo <= x.val && hi >= x.val) {
            list.add(x.val);
        }
        if (hi > x.val) {
            keys(x.right, list, lo, hi);
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
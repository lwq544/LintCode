package SortedArrayToBST;

/**
 * Created by Silocean on 2016-04-04.
 */
public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] arr = {-1, 1};
        TreeNode root = sortedArrayToBST(arr);
        traverseTree(root);
    }

    public static TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        if (A.length == 0) return null;
        return helper(A, 0, A.length - 1);
    }

    private static TreeNode helper(int[] A, int start, int end) {
        TreeNode node = new TreeNode(0);
        if (start == end - 1) {
            node = new TreeNode(A[start]);
            node.right = new TreeNode(A[end]);
        } else if (start == end) {
            return new TreeNode(A[start]);
        } else {
            int mid = (start + end) / 2;
            node.val = A[mid];
            node.left = helper(A, start, mid - 1);
            node.right = helper(A, mid + 1, end);
        }
        return node;
    }

    private static void traverseTree(TreeNode root) {
        if (root != null) {
            traverseTree(root.left);
            traverseTree(root.right);
            System.out.println(root.val);
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
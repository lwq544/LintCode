package BinaryTreePathSum;

import java.util.ArrayList;

/**
 * Created by Silocean on 2016-03-31.
 */
public class BinaryTreePathSum {
    public static void main(String[] args) {
        TreeNode h = new TreeNode(1);
        h.left = new TreeNode(2);
        h.right = new TreeNode(4);
        h.left.left = new TreeNode(2);
        h.left.right = new TreeNode(3);
        binaryTreePathSum(h, 5);
        System.out.println(list.size());
        for (ArrayList<Integer> x : list) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static ArrayList<Integer> temp = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // Write your code here
        findPath(root, target);
        return list;
    }

    public static void findPath(TreeNode root, int target) {
        // Write your code here
        if(root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            temp.add(new Integer(root.val));

            int result = 0;
            for (int x : temp) {
                result += x;
            }
            if (result == target) {
                ArrayList<Integer> al = new ArrayList<>();
                for (int x : temp) {
                    al.add(x);
                }
                list.add(al);
            }

            temp.remove(temp.size() - 1);

        } else {
            temp.add(root.val);
            findPath(root.left, target);
            temp.remove(temp.size() - 1);

            temp.add(root.val);
            findPath(root.right, target);
            temp.remove(temp.size() - 1);
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
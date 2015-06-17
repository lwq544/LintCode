import java.util.ArrayList;

/**
 * Created by Tracy on 2015/6/17.
 * unfinished
 */
public class BinaryTreeSerialization {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        System.out.println(serialize(a));
    }
    public static ArrayList<Object> list = new ArrayList<>();
    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public static ArrayList<Object> serialize(TreeNode root) {
        // write your code here
        if(root!=null) {
            list.add(root.val);
            serialize(root.left);
            serialize(root.right);
        } else {
            list.add("#");
        }
        return list;
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
//    public static TreeNode deserialize(String data) {
//        // write your code here
//
//    }
}

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

import java.util.ArrayList;

/**
 * Created by Tracy on 2016-06-08.
 */
public class SerializeBinaryTree {
    public static void main(String[] args) {
        String data = "{3,9,20,#,#,15,7}";
        TreeNode root = deserialize(data);
        System.out.println(root.left.val);
        System.out.println(root.right.left.val);
    }

    public static String serialize(TreeNode root) {
        if (root == null) return "{}";
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);

        for (int i = 0; i < list.size(); i++) {
            TreeNode node = list.get(i);
            if (node == null) continue;
            list.add(node.left);
            list.add(node.right);
        }

        // 去掉列表最后的null节点
        while (list.get(list.size() - 1) == null) {
            list.remove(list.size() - 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(list.get(0).val);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == null) {
                sb.append(",#");
            } else {
                sb.append("," + list.get(i).val);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static TreeNode deserialize(String data) {
        if (data.equals("{}")) return null;
        ArrayList<TreeNode> list = new ArrayList<>();
        String[] vals = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        list.add(root);
        int index = 0;
        boolean isLeftChild = true;
        for (int i = 1; i < vals.length; i++) {
            if (!vals[i].equals("#")) {
                TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
                if (isLeftChild) {
                    list.get(index).left = node;
                } else {
                    list.get(index).right = node;
                }
                list.add(node);
            }
            if (!isLeftChild) index++;
            isLeftChild = !isLeftChild;
        }
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
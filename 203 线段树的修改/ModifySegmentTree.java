package ModifySegmentTree;

/**
 * Created by Silocean on 2016-04-05.
 */
public class ModifySegmentTree {
    public static void main(String[] args) {
        SegmentTreeNode a = new SegmentTreeNode(1, 4, 3);
        a.left = new SegmentTreeNode(1, 2, 2);
        a.right = new SegmentTreeNode(3, 4, 3);
        a.left.left = new SegmentTreeNode(1, 1, 2);
        a.left.right = new SegmentTreeNode(2, 2, 1);
        a.right.left = new SegmentTreeNode(3, 3, 0);
        a.right.right = new SegmentTreeNode(4, 4, 3);
        modify(a, 2, 4);
        traverseTree(a);
    }

    private static void traverseTree(SegmentTreeNode root) {
        if (root != null) {
            System.out.println("[" + root.start + ", " + root.end + ", max=" + root.max + "]");
            traverseTree(root.left);
            traverseTree(root.right);
        }
    }

    /**
     * 回溯法
     *
     * @param root
     * @param index
     * @param value
     */
    public static void modify(SegmentTreeNode root, int index, int value) {
        if (index == root.start && index == root.end) {
            root.max = value;
            return;
        }
        if (root.start == root.end) {
            return;
        }

        modify(root.left, index, value);
        modify(root.right, index, value);

        root.max = Math.max(root.left.max, root.right.max);
    }


}

class SegmentTreeNode {
    public int start, end, max;
    public SegmentTreeNode left, right;

    public SegmentTreeNode(int start, int end, int max) {
        this.start = start;
        this.end = end;
        this.max = max;
        this.left = this.right = null;
    }
}
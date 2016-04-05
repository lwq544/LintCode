package QuerySegmentTree;

/**
 * Created by Silocean on 2016-04-05.
 */
public class QuerySegmentTree {
    public static void main(String[] args) {
        SegmentTreeNode a = new SegmentTreeNode(0, 3, 4);
        a.left = new SegmentTreeNode(0, 1, 4);
        a.right = new SegmentTreeNode(2, 3, 3);
        a.left.left = new SegmentTreeNode(0, 0, 1);
        a.left.right = new SegmentTreeNode(1, 1, 4);
        a.right.left = new SegmentTreeNode(2, 2, 2);
        a.right.right = new SegmentTreeNode(3, 3, 3);
        System.out.println(query(a, 0, 2));
    }

    public static int query(SegmentTreeNode root, int start, int end) {
        // write your code here
        if (root.end < start || root.start > end) return Integer.MIN_VALUE;
        if (root.start >= start && root.end <= end) {
            return root.max;
        }
        int l = query(root.left, start, end);
        int r = query(root.right, start, end);
        return l > r ? l : r;
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
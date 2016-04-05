package ConstructSegmentTree;

/**
 * Created by Silocean on 2016-04-05.
 */
public class ConstructSegmentTree {
    public static void main(String[] args) {
        SegmentTreeNode root = build(1, 6);
        traverseTree(root);
    }

    public static SegmentTreeNode build(int start, int end) {

        if (start > end) return null;

        SegmentTreeNode node = new SegmentTreeNode(start, end);

        if (start == end) {
            return node;
        } else {
            node.left = build(start, (start + end) / 2);
            node.right = build((start + end) / 2 + 1, end);
        }
        return node;
    }

    private static void traverseTree(SegmentTreeNode root) {
        if (root != null) {
            System.out.println("[" + root.start + "," + root.end + "]");
            traverseTree(root.left);
            traverseTree(root.right);
        }
    }
}

class SegmentTreeNode {
    public int start, end;
    public SegmentTreeNode left, right;

    public SegmentTreeNode(int start, int end) {
        this.start = start;
        this.end = end;
        this.left = this.right = null;
    }
}
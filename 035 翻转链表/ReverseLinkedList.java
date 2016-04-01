package ReverseLinkedList;

/**
 * Created by Silocean on 2016-03-30.
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode n = reverse(node);
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }

    public static ListNode reverse(ListNode head) {
        ListNode p1, p2, p3;
        if (head == null) return head;
        p1 = head;
        p2 = head.next;
        while (p2 != null) { // 从第2个node开始一次插入到head之前
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        head.next = null;
        head = p1;
        return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
package NthToLast;

/**
 * Created by Silocean on 2016-04-05.
 */
public class NthToLast {
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);
        System.out.println(nthToLast2(h, 2).val);
    }

    /**
     * 这种方法不好,时间复杂度O(n^2)
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode p = head;
        int size = 0;
        while (p != null) {
            size++;
            p = p.next;
        }
        for (int i = 0; i < size - n; i++) {
            head = head.next;
        }
        return head;
    }

    /**
     * 时间复杂度O(2n)
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode nthToLast2(ListNode head, int n) {
        if (head == null || n < 1) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = head;
        for (int j = 0; j < n - 1; ++j) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
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
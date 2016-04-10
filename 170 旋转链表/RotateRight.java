package RotateRight;

/**
 * Created by Silocean on 2016-04-10.
 */
public class RotateRight {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(5);
        ListNode head = rotateRight(a, 3);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    /**
     * @param head: the List
     * @param k:    rotate to the right k places
     * @return: the list after rotation
     */
    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null) return null;

        ListNode p = head;
        int length = 0;
        while (p != null) {
            length++;
            p = p.next;
        }
        k = k % length;

        int index = length - k;

        ListNode q = new ListNode(0);
        q.next = head;
        head = q;
        while (index > 0) {
            head = head.next;
            index--;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head.next;
        head.next = null;
        ListNode h = dummy;
        while (k > 0) {
            dummy = dummy.next;
            k--;
        }

        dummy.next = q.next;

        return h.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
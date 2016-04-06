package SwapPairs;

/**
 * Created by Silocean on 2016-04-06.
 */
public class SwapPairs {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        ListNode p = swapPairs(a);
        while (p != null) {
            System.out.print(p.val + ",");
            p = p.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        // Write your code here
        ListNode temp = new ListNode(0);
        temp.next = head;
        head = temp;

        while (head.next != null && head.next.next != null) {
            // head->a->b->...
            // head->b->a->...
            ListNode a = head.next;
            ListNode b = head.next.next;
            head.next = b;
            a.next = b.next;
            b.next = a;
            head = a;
        }
        return temp.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
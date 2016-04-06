package DeleteDuplicates;

/**
 * Created by Silocean on 2016-04-06.
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(2);
        a.next.next.next = new ListNode(4);
        ListNode p = deleteDuplicates(a);
        while (p != null) {
            System.out.print(p.val + ",");
            p = p.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        // head->a->b->...
        // head->a->...
        ListNode temp = new ListNode(0);
        temp.next = head;
        head = temp;

        while (head.next != null && head.next.next != null) {
            ListNode a = head.next;
            ListNode b = head.next.next;

            if (a.val == b.val) {
                a.next = b.next;
            } else {
                head = a;
            }
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
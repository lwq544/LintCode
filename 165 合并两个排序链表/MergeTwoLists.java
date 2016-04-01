package MergeTwoLists;

/**
 * Created by Silocean on 2016-03-31.
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(11);
        l1.next.next.next.next = new ListNode(15);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(45);
        ListNode head = mergeTwoLists(l1, l2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l3.next = new ListNode(l1.val);
                l3 = l3.next;
                l1 = l1.next;
            } else {
                l3.next = new ListNode(l2.val);
                l3 = l3.next;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            l3.next = new ListNode(l1.val);
            l3 = l3.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            l3.next = new ListNode(l2.val);
            l3 = l3.next;
            l2 = l2.next;
        }

        head = head.next;
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
package PartitionList;

/**
 * Created by Silocean on 2016-04-05.
 */
public class PartitionList {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(2);
        a.next.next.next.next = new ListNode(5);
        a.next.next.next.next.next = new ListNode(2);
        ListNode p = partition(a, 3);
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode oriNode = new ListNode(0);
        oriNode.next = head;
        ListNode q = oriNode;

        ListNode newNode = new ListNode(0);
        ListNode p = newNode;

        while (oriNode != null && oriNode.next != null) {
            if (oriNode.next.val < x) {
                newNode.next = oriNode.next;
                newNode = newNode.next;
                oriNode.next = oriNode.next.next;
            } else {
                oriNode = oriNode.next;
            }
        }

        newNode.next = q.next;

        return p.next;
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
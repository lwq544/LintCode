package RemoveNthFromEnd;

/**
 * Created by Silocean on 2016-03-31.
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);
        ListNode head = removeNthFromEnd(h, 5);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode p = head;
        int size = 0;
        while (p != null) {
            size++;
            p = p.next;
        }
        if (n == size) { // 去掉头节点就好了
            head = head.next;
        } else {
            int index = size - n;
            ListNode temp = head;
            while (index > 1) {
                temp = temp.next;
                index--;
            }
            temp.next = temp.next.next;
        }
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
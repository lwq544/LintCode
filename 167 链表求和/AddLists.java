package AddLists;

/**
 * Created by Silocean on 2016-04-03.
 */
public class AddLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(7);
        ListNode node = addLists(l1, l2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode addLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        int index = 0; // 进位
        ListNode l3 = new ListNode(0);
        ListNode node = l3;
        while (l1 != null && l2 != null) {
            int num = l1.val + l2.val + index;
            index = num / 10;
            node.next = new ListNode(num % 10);
            l1 = l1.next;
            l2 = l2.next;
            node = node.next;
        }

        while (l1 != null) {
            int num = l1.val + index;
            index = num / 10;
            node.next = new ListNode(num % 10);
            l1 = l1.next;
            node = node.next;
        }

        while (l2 != null) {
            int num = l2.val + index;
            index = num / 10;
            node.next = new ListNode(num % 10);
            l2 = l2.next;
            node = node.next;
        }

        if (index != 0) node.next = new ListNode(index);

        return l3.next;
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

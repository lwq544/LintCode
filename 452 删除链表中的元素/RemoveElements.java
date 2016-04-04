package RemoveElements;

/**
 * Created by Silocean on 2016-04-04.
 */
public class RemoveElements {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(3);
        a.next.next.next.next = new ListNode(4);
        ListNode p = removeElements(a, 3);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }

    /**
     * @param head a ListNode
     * @param val  an integer
     * @return a ListNode
     */
    public static ListNode removeElements(ListNode head, int val) {
        // Write your code here
        ListNode temp = new ListNode(0); // 新建一个头节点
        temp.next = head;
        head = temp;

        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
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
/**
 * 给定一个单链表中的表头和一个等待被删除的节点(非表头或表尾)。
 * 请在在O(1)时间复杂度删除该链表节点。并在删除该节点后，返回表头。
 * Created by Silocean on 2016-03-31.
 */
public class DeleteNode {

    public static ListNode head = new ListNode(1);

    public static void main(String[] args) {
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        deleteNode(head.next.next.next);
        ListNode p = head;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }

    public static void deleteNode(ListNode node) {
        // write your code here
        if (node.next != null) { // 如果node后面的节点不是null，就把node的值赋给后面的节点
            int temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;

            node.next = node.next.next; // 删除节点
        } else { // 如果node是最后一个节点,顺序查找node
            ListNode p = head;
            while (p.next.val != node.val) {
                p = p.next;
            }
            p.next = null;
        }
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
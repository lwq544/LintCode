package DeleteDuplicatesII;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Silocean on 2016-04-06.
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode t = deleteDuplicates(head);
        while (t != null) {
            System.out.println(t.val);
            t = t.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        Map<Integer, Integer> map = new LinkedHashMap<>();
        ListNode tmp = head;
        while (tmp != null) {
            if (map.get(tmp.val) == null) {
                map.put(tmp.val, 1);
            } else {
                map.put(tmp.val, map.get(tmp.val) + 1);
            }
            //map.put(tmp.val, map.getOrDefault(tmp.val, 0) + 1);
            tmp = tmp.next;
        }
        ListNode h = new ListNode(0);
        ListNode hTmp = h;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                h.next = new ListNode(entry.getKey());
                h = h.next;
            }
        }
        return hTmp.next;
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
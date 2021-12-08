package hash.hasCycle;

import java.util.HashMap;
import java.util.Map;

public class HasCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        // head.next.next.next.next = head.next;
        Map<ListNode, Boolean> hashTable = new HashMap<>();
        while (head != null) {
            if (hashTable.keySet().contains(head)) {
                break;
            } else {
                hashTable.put(head, true);
                head=head.next;
            }
        }
        System.out.println(head != null);
    }
}

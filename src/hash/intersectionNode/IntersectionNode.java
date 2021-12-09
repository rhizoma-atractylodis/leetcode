package hash.intersectionNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionNode {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);
        headA.next=new ListNode(3);
        headA.next.next=new ListNode(5);
        headA.next.next.next=new ListNode(10);
        headA.next.next.next.next=new ListNode(20);
        headB.next=new ListNode(4);
        headB.next.next=new ListNode(6);
        headB.next.next.next=new ListNode(10);
        headB.next.next.next.next=new ListNode(20);
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode result = new ListNode(-1);
        while(headA!=null) {
            map.put(headA.val, headA);
            headA=headA.next;
        }
        while(headB!=null) {
            result=map.get(headB.val);
            if (result!=null) {
                break;
            }
            headB=headB.next;
        }
        System.out.println(result.val);
    }
}

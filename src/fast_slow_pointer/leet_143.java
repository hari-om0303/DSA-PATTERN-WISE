package fast_slow_pointer;

import java.util.List;

public class leet_143 {
    class ListNode {
        int val;
       ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void reorderList(ListNode head) {
        ListNode middle_ele = middle(head);
        ListNode second = revers(middle_ele.next);
        middle_ele.next = null;
        ListNode first = head;

        while (first !=null && second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public static ListNode revers(ListNode head){
        ListNode prev = null;
        ListNode pres = head;
        while (pres != null){
            ListNode next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
        }
        return prev;
    }

    public static ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

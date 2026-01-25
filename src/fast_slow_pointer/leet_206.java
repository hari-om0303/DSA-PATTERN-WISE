package fast_slow_pointer;

import java.util.List;

public class leet_206 {
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

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        while (pres != null) {
            ListNode next = pres.next;
            pres.next = prev;
            prev = next;
            pres = next;
        }
        return prev;
    }
}
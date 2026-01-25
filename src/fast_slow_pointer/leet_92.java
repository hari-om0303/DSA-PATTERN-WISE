package fast_slow_pointer;

import java.text.BreakIterator;

public class leet_92 {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode next = null;
        for (int i=0; i< right-left ; i++){
           next = curr.next;
           curr.next = next.next;
           next.next = prev.next;
           prev.next = next;
        }
         return dummy.next;
    }
}

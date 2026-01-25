package fast_slow_pointer;

import java.util.List;

public class leet_234 {
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

    public boolean isPalindrome(ListNode head) {
        if (head == null && head.next == null) return true;
        ListNode middle = middle(head);
        ListNode first = head;

        ListNode sec = revers(middle);
        while (sec != null) {
            if (first.val != sec.val)
                return false;
            first = first.next;
            sec = sec.next;
        }
        return true;
    }

    public static ListNode revers(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        while (pres != null) {
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

    public static void main(String[] args) {
        leet_234 obj = new leet_234();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(2);
        head.next.next.next = obj.new ListNode(1);
        System.out.println(obj.isPalindrome(head));
    }
}

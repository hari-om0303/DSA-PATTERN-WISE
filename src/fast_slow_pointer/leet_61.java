package fast_slow_pointer;

public class leet_61 {
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

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) return head;
        int n = length(head);
        k = k % n; // to reduce k
        if (k == 0) return head;

        ListNode tail = head;
//        find tail
        while (tail.next != null) {
            tail = tail.next;
        }

//        to make list circular
        tail.next = head;

        ListNode newtail = head;
        for (int i = 1; i < n - k; i++) {
            newtail = newtail.next;
        }

        ListNode newhead = newtail.next;
//        break circle
      newtail.next = null;
        return newhead;
    }

    public static int length(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}

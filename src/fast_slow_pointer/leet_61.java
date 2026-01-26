package fast_slow_pointer;

public class leet_61 {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public Node rotateRight(Node head, int k) {

        if (head == null || head.next == null) return head;
        int n = length(head);
        k = k % n; // to reduce k
        if (k == 0) return head;

        Node tail = head;
//        find tail
        while (tail.next != null) {
            tail = tail.next;
        }

//        to make list circular
        tail.next = head;

        Node newtail = head;
        for (int i = 1; i < n - k; i++) {
            newtail = newtail.next;
        }

        Node newhead = newtail.next;
//        break circle
      newtail.next = null;
        return newhead;
    }

    public static int length(Node head) {
        Node node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}

package fast_slow_pointer;

import java.util.HashMap;

public class leet_138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        public Node(int val, Node next , Node random) {
            this.val = val;
            this.next = next;
            this.random = random;
        }
    }
    public Node copyRandomList(Node head) {
      if (head == null) return head;
        Node oldnode = head;

        HashMap<Node, Node> map = new HashMap<>();

        while (oldnode != null){
            map.put(oldnode , new Node(oldnode.val));
            oldnode = oldnode.next;
        }

        oldnode = head;

        while (oldnode != null){
        Node copy = map.get(oldnode);
        copy.next = map.get(oldnode.next);
        copy.random = map.get(oldnode.random);
        oldnode = oldnode.next;
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        leet_138 obj = new leet_138();

        // Creating nodes
        Node n1 = obj.new Node(1);
        Node n2 = obj.new Node(2);
        Node n3 = obj.new Node(3);

        // Setting next pointers
        n1.next = n2;
        n2.next = n3;

        // Setting random pointers
        n1.random = n3; // 1 → 3
        n2.random = n1; // 2 → 1
        n3.random = n2; // 3 → 2

        // Copy list
        Node copiedHead = obj.copyRandomList(n1);

        // Print original and copied list
        System.out.println("Original List:");
        printList(n1);

        System.out.println("\nCopied List:");
        printList(copiedHead);
    }

    // Helper function to print list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            int randomVal = (curr.random != null) ? curr.random.val : -1;
            System.out.println("Node value = " + curr.val + ", Random points to = " + randomVal);
            curr = curr.next;
        }
    }
}

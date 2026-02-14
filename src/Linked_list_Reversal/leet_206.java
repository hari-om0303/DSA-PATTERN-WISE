package Linked_list_Reversal;

public class leet_206 {
    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void prinlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        leet_206 lc = new leet_206();
        Node head = lc.new Node(1);
        head.next = lc.new Node(2);
        head.next.next = lc.new Node(3);
        head.next.next.next = lc.new Node(4);
        head.next.next.next.next = lc.new Node(5);
        System.out.println("original list : ");
        prinlist(head);
        Node reversLinedList = lc.reverseList(head);
        System.out.println("reverse list : ");
        prinlist(reversLinedList);
    }
}

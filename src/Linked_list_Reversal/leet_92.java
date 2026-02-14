package Linked_list_Reversal;

public class leet_92 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseBetween(ListNode head, int left, int right) {
          if (head == null || right == left) return head;
           ListNode t = head;
           ListNode before = null;
           int pos = 1;

               while (pos<left){
                   before = t;
                   t = t.next;
                   pos++;
               }

              ListNode curr = t;
               ListNode prev = null;
               int times = right-left+1;
             for (int i=1 ; i<=times; i++){
                 ListNode next = curr.next;
                 curr.next = prev;
                 prev = curr;
                 curr = next;
             }
             if (before != null) {
                 before.next = prev;
             }else {
                 head = prev;
             }
             t.next = curr;
           return head;
    }

    public static void prinlist(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        leet_92 lc = new leet_92();
        ListNode head = lc.new ListNode(1);
        head.next = lc.new ListNode(2);
        head.next.next = lc.new ListNode(3);
        head.next.next.next = lc.new ListNode(4);
        head.next.next.next.next = lc.new ListNode(5);
        System.out.println("original list : ");
        prinlist(head);
        ListNode reversLinedList = lc.reverseBetween(head , 2 ,4);
        System.out.println("reverse list : ");
        prinlist(reversLinedList);
    }
}

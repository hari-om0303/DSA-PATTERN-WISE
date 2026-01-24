package fast_slow_pointer;

public class leet_876 {
            class ListNode {
                int val;
                ListNode next;
                public ListNode(int val){
                    this.val = val;
                }
                public ListNode(int val , ListNode next){
                    this.val = val;
                    this.next = next;
                }
            }
    public ListNode middleNode(ListNode head) {
          ListNode slow = head;
          ListNode fast = head;
          while (fast != null && fast.next != null){
              slow = slow.next;
              fast = fast.next.next;
          }
          return slow;
    }
}

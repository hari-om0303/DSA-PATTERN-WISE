package fast_slow_pointer;

public class leet_160 {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          ListNode first = headA;
          ListNode second = headB;
          while (first != second){
              first = (first == null) ? headB : first.next;
              second = (second == null) ? headA : second.next;
          }
          return first;
    }
}

package fast_slow_pointer;

public class leet_142 {
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

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

}

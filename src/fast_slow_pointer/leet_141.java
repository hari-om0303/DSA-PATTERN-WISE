package fast_slow_pointer;

public class leet_141 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        while (slow != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if (slow==fast){
                    return true;
                }
        }
        return false;
    }
    public static void main(String[] args) {
       leet_141 list = new leet_141();
    }
}

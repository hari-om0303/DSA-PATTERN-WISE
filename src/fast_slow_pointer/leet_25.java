package fast_slow_pointer;

public class leet_25 {
    class ListNode {
        int val;
       ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
         if (!len(head , k)) return head;

         ListNode nextgrp =  getNext(head , k);
         ListNode newnode = revers(head , k);

         head.next = reverseKGroup(nextgrp , k);
         return newnode;
    }
    public static ListNode getNext(ListNode head , int k){
        while (k>0 && head != null){
            head = head.next;
            k--;
        }
        return head;
    }
    public static boolean len(ListNode head , int k){
        ListNode current = head;
        int count = 0;
        while (current != null && count<k){
            current = current.next;
            count++;
        }
        return count==k;
    }
    public static ListNode revers(ListNode head, int k){
      ListNode prev = null;
        ListNode pres = head;
        while (k>0 && pres != null ){
           ListNode next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
            k--;
        }
        return prev;
    }
}

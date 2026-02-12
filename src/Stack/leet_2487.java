package Stack;
import java.util.Stack;

public class leet_2487 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
       while (curr != null){
           while (!st.isEmpty() && st.peek().val<curr.val){
               st.pop();
           }
           st.push(curr);
           curr = curr.next;
       }
        ListNode next = null;
       while (!st.isEmpty()){
           ListNode newnode = st.pop();
           newnode.next = next;
           next = newnode;
       }
       return  next;
    }
}

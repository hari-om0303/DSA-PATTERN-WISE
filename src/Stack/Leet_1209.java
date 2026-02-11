package Stack;
import java.util.Stack;
public class Leet_1209 {
    public static String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && st.peek()[0] == ch) {
                st.peek()[1]++;

                if (st.peek()[1] == k) {
                    st.pop();
                }
            } else {
                st.push(new int[]{ch, 1});
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            int[] pair = st.pop();
            char c = (char) pair[0];
            int count = pair[1];
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa",  3));
    }
}

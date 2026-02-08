package Stack;

import java.util.Stack;

public class leet_1047 {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() <= 1) return s;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        leet_1047 lc = new leet_1047();
        System.out.println(lc.removeDuplicates("abbaca"));
    }
}

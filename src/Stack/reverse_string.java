package Stack;

import java.util.Stack;

public class reverse_string {
    public static void revrseString(String s){
        Stack<Character> st = new Stack<>();
        for (int i =0 ; i<s.length(); i++){
            st.push(s.charAt(i));
        }
        while (!st.isEmpty()) {
            char ch = st.pop();
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        revrseString("Abcdefgh");
    }
}

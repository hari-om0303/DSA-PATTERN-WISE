package Stack;

import java.util.Stack;

public class leet_20 {
    public boolean validparanthesis(String s){
        Stack<Character> st = new Stack<>();
       for (char ch : s.toCharArray()){
           if (ch == '(' || ch == '{' || ch == '['){
                  st.push(ch);
           }else {
               if (ch == ')'){
                   if (st.isEmpty()|| st.pop() != '('){
                       return false;
                   }
               }
               if (ch == ']'){
                   if (st.isEmpty() || st.pop() != '['){
                       return false;
                   }
               }
               if (ch == '}'){
                   if (st.isEmpty() || st.pop() != '{'){
                 return false;
                   }
               }
           }
       }
       return st.isEmpty();
    }

    public static void main(String[] args) {
        leet_20 lc = new leet_20();
        System.out.println(lc.validparanthesis("{}[]"));
    }
}

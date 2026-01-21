package sliding_window;

import java.util.HashMap;

public class leet_76 {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0){
            return "";
        }

       int [] need = new int[128];
        for (char ch : t.toCharArray()){
            need[ch]++;
        }

        int left = 0;
        int right =0;
       int start =0 ;
       int minlen = Integer.MAX_VALUE;
       int required = t.length();

       while (right<s.length()){
           char c = s.charAt(right);

           if (need[c] > 0){
               required--;
           }
           need[c]--;
           right++;

           while (required == 0){
               if (right-left<minlen){
                   minlen = right-left;
                   start = left;
               }

           char leftchar = s.charAt(left);
           need[leftchar]++;
           if (need[leftchar]>0){
               required++;
           }
           left++;
       }
       }
 return minlen == Integer.MAX_VALUE ? " " : s.substring(start , start+minlen);
    }

    public static void main(String[] args) {
        leet_76 o = new leet_76();
        System.out.println(o.minWindow("ADOBECODEBANC" , "ABC"));
    }
}

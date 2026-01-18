package sliding_window;

import java.util.HashMap;

public class leet_03 {
    public int longest_subString(String s){
        int low = 0;
        int result = Integer.MIN_VALUE;
        HashMap<Character , Integer> map = new HashMap<>();
        for (int high=0 ; high<s.length(); high++){
            char ch = s.charAt(high);
           if (map.containsKey(ch)){
               low = Math.max(low , map.get(ch)+1);
           }
           map.put(ch , high);
           result = Math.max(result , high-low+1);
        }
        return result;
    }

    public static void main(String[] args) {
        leet_03 o =  new leet_03();
        System.out.println(o.longest_subString("abcabcbb"));
    }
}

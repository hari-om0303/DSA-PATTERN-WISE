package HashMaps__;

import java.util.HashMap;

public class leet_409 {
    public static int longestPalindrome(String s) {
        if (s.length() == 1) return 1;
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i =0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        int sum = 0;
        boolean hasOdd = false;
        for (Character key : map.keySet()){
            if (map.get(key)%2==0){
                sum += map.get(key);
            }else {
                sum += map.get(key)-1;
                hasOdd = true;
            }
        }
        if (hasOdd){
            sum += 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }
}

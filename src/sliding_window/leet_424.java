package sliding_window;

import java.util.HashMap;

public class leet_424 {
    public int characterReplacement(String s, int k) {
           int low = 0;
           int res = 0;
           int [] arr = new int[26];
           int maxfrq = 0;
          for (int high=0; high<s.length(); high++){
              char ch = s.charAt(high);
              int index = ch - 'A';
              arr[index]++;
            maxfrq = Math.max(maxfrq , arr[index]);
            int windsize = high-low+1;
            if(windsize - maxfrq >k){
                arr[s.charAt(low) - 'A']--;
                low++;
            }

            res = Math.max(   res, high-low+1);
          }
          return res;
    }

    public static void main(String[] args) {
        leet_424 o = new leet_424();
        System.out.println(o.characterReplacement("AABABBA" , 1));
    }
}

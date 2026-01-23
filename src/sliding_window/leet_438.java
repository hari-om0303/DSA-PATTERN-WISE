package sliding_window;

import java.util.*;

public class leet_438 {
    public static List<Integer> findAnagrams(String s, String p) {
        int[] freqp = new int[26];
        for (char ch : p.toCharArray()) {
            freqp[ch - 'a']++;
        }

        int low = 0;
        int windsize = p.length();
        List<Integer> result = new ArrayList<>();
        int[] freqwind = new int[26];

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            freqwind[ch - 'a']++;

            int len = high - low + 1;

            if (len > windsize) {
                freqwind[s.charAt(low) - 'a']--;
                low++;
            }
            len = high-low+1;
            if (len == windsize && Arrays.equals(freqwind, freqp)) {
                result.add(low);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd" , "abc"));
    }
}


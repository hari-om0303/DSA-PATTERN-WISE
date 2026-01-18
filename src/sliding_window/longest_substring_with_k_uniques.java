package sliding_window;

import java.util.HashMap;

public class longest_substring_with_k_uniques {
    public int LongestSubString(String s, int k) {
        int low = 0;
        int result = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(low);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                low++;
            }

            if (map.size() == k) {
                result = Math.max(result, high - low + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        longest_substring_with_k_uniques obj = new longest_substring_with_k_uniques();
        int ans = obj.LongestSubString("aabbcb" , 2);
        System.out.println(ans);
    }
}

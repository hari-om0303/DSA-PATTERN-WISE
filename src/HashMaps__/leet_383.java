package HashMaps__;

import java.util.HashMap;

public class leet_383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        for (Character key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                return false;
            }
            if (map2.get(key) < map1.get(key)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}

package HashMaps__;

import java.util.HashMap;

public class leet_1189 {
    public static int maxNumberOfBalloons(String text) {
        int res = Integer.MAX_VALUE;
        HashMap<Character, Integer> have = new HashMap<>();
        for (int i=0 ; i<text.length(); i++){
            char ch = text.charAt(i);
            have.put(ch , have.getOrDefault(ch , 0) +1);
        }
        HashMap<Character , Integer> need = new HashMap<>();
        String s = "balloon";
        for (int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            need.put(ch , need.getOrDefault(ch , 0) +1);
        }

        for (Character key : need.keySet()){
            int needoc = need.get(key);
            int haveoc = have.getOrDefault(key , 0);
            int oc =  haveoc/needoc;  //oc = occurence
            res = Math.min( res, oc);
        }
     return res;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }
}

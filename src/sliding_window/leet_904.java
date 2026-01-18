package sliding_window;

import java.util.HashMap;

public class leet_904 {
    public int totalFruit(int[] fruits) {
        int low = 0 ;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int high=0; high<fruits.length; high++){
              map.put(fruits[high] , map.getOrDefault(fruits[high], 0 )+1);
              while (map.size()>2){
               int leftlow = fruits[low];
               map.put(leftlow, map.get(leftlow)-1);
               if (map.get(leftlow) == 0){
                   map.remove(leftlow);
               }
               low++;
              }
              result = Math.max(result , high-low+1);
        }
        return result;
    }

    public static void main(String[] args) {
        leet_904 obj = new leet_904();
        int [] num = {0,1,2,2};
        System.out.println(obj.totalFruit(num));
    }
}

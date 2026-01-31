package prefix_suffix;

import java.util.HashMap;

public class leet_525 {
    public static int findMaxLength(int[] nums) {
         int one = 0 , zero = 0 ,  res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
         for (int i=0; i<nums.length; i++){
             if (nums[i]==1){
                 one++;
             }else {
                 zero++;
             }
             int diff = zero - one;
             if (map.containsKey(diff)){
                 int previndx = map.get(diff);
                 int len = i-previndx;
                 res = Math.max(len , res);
             }else {
             map.put(diff , i);
             }
         }
             return res;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
}

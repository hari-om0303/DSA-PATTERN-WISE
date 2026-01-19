package sliding_window;

import java.util.HashMap;

public class leet_1004 {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int result = 0;
        int zeros= 0;
        for (int high=0; high<nums.length; high++){
            if (nums[high]==0){
                zeros++;
            }
            while (zeros>k){
               if (nums[low] ==0){
                   zeros--;
               }
                low++;
            }
          result = Math.max(result , high-low+1);
        }
        return result;
    }

    public static void main(String[] args) {
        leet_1004 o = new leet_1004();
        int [] num = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(o.longestOnes(num , 2));
    }
}

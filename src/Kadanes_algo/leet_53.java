package Kadanes_algo;

public class leet_53 {
    public static int maxSubArray(int[] nums) {
     int bestend = nums[0];
     int ans = nums[0];
     for (int i=1; i< nums.length; i++){
         int v1 = nums[i];
         int v2 = bestend+nums[i];
         bestend = Math.max(v1 , v2);
         ans = Math.max(ans , bestend);
     }
     return ans;
    }

    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

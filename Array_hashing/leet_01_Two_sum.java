package Array_hashing;

import java.util.Arrays;

public class leet_01_Two_sum {
    public int[] twoSum(int[] nums, int target) {
         for (int i=0 ; i<= nums.length-1; i++){
             for (int j=i+1; j<= nums.length-1 ; j++){
                 if (nums[i]+nums[j] == target){
                     return  new int[]{i, j};
                 }
             }
         }
         return new int[]{};
    }

    public static void main(String[] args) {
        leet_01_Two_sum l1 = new leet_01_Two_sum();
        int [] arr = {2,3,4,5,6};
        int [] ans = l1.twoSum(arr, 11);
        System.out.println(Arrays.toString(ans));
    }
}

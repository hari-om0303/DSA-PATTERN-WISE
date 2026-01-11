package Arrays_Hashing;

import java.util.Arrays;

public class leet_01 {
    static int[] twoSum(int[] nums, int target) {
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
        int [] arr = {12,3,4,5,5,6};
        int [] ans = twoSum(arr, 10);
        System.out.println(Arrays.toString(ans));
    }
}

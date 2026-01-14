package Two_pointers;

import java.util.Arrays;

public class leet_283 {
    public static void moveZeroes(int[] nums) {
         int index = 0;
         for (int i=0; i<nums.length; i++) {
             if (nums[i] != 0) {
                 nums[index] = nums[i];
                 index++;
             }
         }
         while (index< nums.length){
             nums[index] = 0;
             index++;
         }
    }

    public static void main(String[] args) {
        int [] num = {0,1,0,3,12};
      moveZeroes(num);
        System.out.println(Arrays.toString(num));
    }

}

package Two_pointers;

//167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;

public class leet_167 {

    public int[] twoSum(int[] numbers, int target) {
         int left = 0;
         int right = numbers.length-1;
         while (left<right){
             int sum = numbers[left]+numbers[right];
             if (sum==target){
                 return new int []{left+1 , right+1};
             }else if (sum < target){
                 left++;
             }else {
                 right--;
             }
         }
       return new int []{};
    }

    public static void main(String[] args) {
      leet_167 obj = new leet_167();
      int [] nums = {2,7,11,15};
      int [] ans = obj.twoSum(nums , 26);
        System.out.println(Arrays.toString(ans));
    }
}

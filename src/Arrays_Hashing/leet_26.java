package Arrays_Hashing;

import java.util.Arrays;

public class leet_26 {
    public int removeDuplicates(int[] nums) {
      if (nums.length == 0){
          return 0;
      }
      int slow = 0;
      for (int fast=1 ; fast< nums.length; fast++){
          if (nums[fast] != nums[slow]){
              slow++;
              nums[slow] = nums[fast];
          }
      }
      return slow+1;
    }

    public static void main(String[] args) {
        leet_26 obje  = new leet_26();
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = obje.removeDuplicates(arr);
        System.out.println(ans);

        for (int i=0 ; i<ans; i++){
            System.out.println(arr[i]);
        }
    }
}

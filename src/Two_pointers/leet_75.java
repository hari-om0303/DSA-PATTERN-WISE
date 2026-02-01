package Two_pointers;

import java.util.Arrays;

public class leet_75 {
//    this appraoch is not acceptable , because it is using extra space
    public static int[] sortColors(int[] nums) {
        int f = 0;
        int s = 0;
        int t = 0;
        int[] newarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                f++;
            } else if (nums[i] == 1) {
                s++;
            } else if (nums[i] == 2) {
                t++;
            }
        }
        for (int i = 0; i <=f-1; i++) {
            newarr[i] = 0;
        }
          for (int i = f; i <=f+s-1; i++) {
            newarr[i] = 1;
        }
          for (int i = f+s; i <=f+s+t-1; i++) {
            newarr[i] = 2;
        }
 return newarr;
    }

//    interview acceptable
    public void sortColor(int [] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while (mid<=high){
            if (nums[mid] == 0 ){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int [] num = {2,0,2,1,1,0,0};
        int [] ans = sortColors(num);
        System.out.println(Arrays.toString(ans));
    }
}

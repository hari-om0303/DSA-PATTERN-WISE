package prefix_suffix;

public class leet_724 {
    public static int pivotIndex(int[] nums) {
        int sum = arrSum(nums);
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            int right = sum - left - nums[i];

            if (left == right) {
                return i;
            }

            left += nums[i];
        }

        return -1;
    }


    public static int arrSum(int[] nums) {
        int  sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }

    public static void main(String[] args) {
//        int [] arr = {1,7,3,6,5,6};
        int [] arr = {1,2,3};
        System.out.println(pivotIndex(arr));
    }
}

package Kadanes_algo;

public class leet_918 {
    public static int maxSubarraySumCircular(int[] nums) {
        int kadan_max = maxx(nums);
        int sumofarr = arrSum(nums);
        int arr_side_max = sumofarr - minn(nums);

        if (kadan_max<0) return kadan_max;

        return Math.max(kadan_max , arr_side_max);

    }

//    arr sum
    public static int arrSum(int [] nums){
        int arr_sum = 0;
        for (int i=0 ; i< nums.length; i++){
            arr_sum += nums[i];
        }
        return arr_sum;
    }

//for case 1 , to find mid part
    public static int maxx(int [] arr){
        int bestend = arr[0];
        int ans = arr[0];
        for (int i=1; i<arr.length; i++){
            int v1 = arr[i];
            int v2 = bestend + arr[i];
            bestend = Math.max(v1 , v2);
            ans = Math.max(bestend ,ans);
        }
        return ans;
    }

//    for case 2 , to find side parts
public static int minn(int [] arr){
    int bestend = arr[0];
    int ans = arr[0];
    for (int i=1; i<arr.length; i++){
        int v1 = arr[i];
        int v2 = bestend + arr[i];
        bestend = Math.min(v1 , v2);
        ans = Math.min(bestend ,ans);
    }
    return ans;
}

    public static void main(String[] args) {
       int [] nums = {-3,-2,-3};
        System.out.println(maxSubarraySumCircular(nums));
    }
}

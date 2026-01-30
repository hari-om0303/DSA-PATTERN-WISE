package Kadanes_algo;

public class leet_1191 {

    static final int MOD = 1_000_000_007;

    public static int kConcatenationMaxSum(int[] arr, int k) {

        long kadaneSingle = kadane(arr);

        // If all values are negative, empty subarray allowed
        if (kadaneSingle < 0) return 0;

        if (k == 1) return (int)(kadaneSingle % MOD);

        long totalSum = arrSum(arr);

        long result;

        if (totalSum > 0) {
            result = prefixMax(arr) + suffixMax(arr) + (long)(k - 2) * totalSum;
        } else {
            result = twoConcatKadane(arr);
        }

        return (int)(result % MOD);
    }

    public static long kadane(int[] arr) {
        long bestEnd = arr[0];
        long ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            bestEnd = Math.max(arr[i], bestEnd + arr[i]);
            ans = Math.max(ans, bestEnd);
        }

        return ans;
    }

    public static long arrSum(int[] nums) {
        long sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }

    public static long prefixMax(int[] arr) {
        long sum = 0;
        long best = Long.MIN_VALUE;

        for (int num : arr) {
            sum += num;
            best = Math.max(best, sum);
        }

        return best;
    }

    public static long suffixMax(int[] arr) {
        long sum = 0;
        long best = Long.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            best = Math.max(best, sum);
        }

        return best;
    }

    public static long twoConcatKadane(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[2 * n];

        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
            newArr[i + n] = arr[i];
        }

        return kadane(newArr);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, -2, 1};
        System.out.println(kConcatenationMaxSum(nums1, 5)); // 2

        int[] nums2 = {-1, -2};
        System.out.println(kConcatenationMaxSum(nums2, 7)); // 0

        int[] nums3 = {10000,10000,10000,10000,10000,10000,10000,10000,10000,10000};
        System.out.println(kConcatenationMaxSum(nums3, 100000)); // 999999937 ✅
    }
}

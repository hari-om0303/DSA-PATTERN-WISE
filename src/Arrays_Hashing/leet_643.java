package Arrays_Hashing;

public class leet_643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        int maxsum = sum;

        for (int j=k; j< nums.length; j++){
            sum = sum + nums[j] - nums[j-k];
            maxsum = Math.max(sum , maxsum);
        }
        return (double) maxsum/k;
    }
    public static void main(String[] args) {
        leet_643 obj  = new leet_643();
        int [] arr = {1,12,-5,-6,50,3};
        double ans = obj.findMaxAverage(arr, 4);
        System.out.println(ans);
    }
}

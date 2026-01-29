package Kadanes_algo;

public class leet_1749 {
    public static int maxAbsoluteSum(int[] nums) {
        int abs_max = Math.abs(maxx(nums));
        int abs_min = Math.abs(minn(nums));
        return Math.max(abs_max , abs_min);
    }
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
       int [] arr = {2,-5,1,-4,3,-2};
        System.out.println(maxAbsoluteSum(arr));
    }
}

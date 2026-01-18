package sliding_window;

public class leet_209 {
    public int sizeofsubarray(int [] nums , int targ){
        int low = 0;
        int sum = 0;
        int result =  Integer.MAX_VALUE;
        for (  int high = 0; high< nums.length; high++){
         sum = sum + nums[high];
         while (sum>=targ){
             int len = high-low+1;
           result = Math.min(result,len);
             sum = sum-nums[low];
             low++;
         }
        }
        return result;
    }

    public static void main(String[] args) {
        leet_209 obj = new leet_209();
        int [] nums = {1,4,4,12};
        System.out.println(obj.sizeofsubarray(nums, 4));
    }
}

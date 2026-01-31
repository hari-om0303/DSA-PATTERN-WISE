package prefix_suffix;

import java.util.HashMap;

public class leet_560 {
    public static int subarraySum(int[] nums, int k) {
         int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for (int i=0; i< nums.length; i++){
            sum += nums[i];
            int ques = sum-k;
           if (map.containsKey(ques)){
            ans += map.get(ques);
           }
           map.put(sum , map.getOrDefault(sum,0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(subarraySum(nums , 3));
    }
}

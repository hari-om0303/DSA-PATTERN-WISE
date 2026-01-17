package Two_pointers;

public class leet_26 {
     public int removeDuplicates(int [] nums){
        if (nums == null) return 0;

        int slow = 0;
        for (int fast=1; fast<= nums.length-1; fast++){
            if (nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
     }
    public static void main(String[] args) {
        leet_26 obj  = new leet_26();
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = obj.removeDuplicates(arr);
        System.out.println("ans : " + ans);
    }
}

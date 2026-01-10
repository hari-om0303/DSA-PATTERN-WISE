package Array_hashing;

public class leet_217_duplicate_contains {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1 ; j < nums.length ; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        leet_217_duplicate_contains l = new  leet_217_duplicate_contains();
        int [] arr = {3,2,4,1,2};
         boolean ans = l.containsDuplicate(arr);
        System.out.println(ans);
    }
}

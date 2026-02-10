package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class leet_503 {
    public int[] nextGreaterElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) ans.add(-1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int indx = i % n;
            while (!st.isEmpty() && nums[st.peek()] < nums[indx]) {
                ans.set(st.pop(), nums[indx]);
            }
            if (i < n) {
                st.push(indx);
            }
        }
//            converting arraylist to array
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        leet_503 lc = new leet_503();

        int[] nums1 = {1, 2, 1};
        int[] nums2 = {3, 8, 4, 1, 2};

        System.out.println(java.util.Arrays.toString(lc.nextGreaterElements(nums1)));
        System.out.println(java.util.Arrays.toString(lc.nextGreaterElements(nums2)));
    }
}

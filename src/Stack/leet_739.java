package Stack;

import java.util.Arrays;
import java.util.Stack;

public class leet_739 {
    public int[] dailyTemperatures(int[] temperatures) {
       int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];
        Arrays.fill(res , 0);
        for (int i=0; i<n; i++){
            while (!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
              int preday  = st.pop();
                res[preday] = i- preday;
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
      leet_739 lc = new leet_739();

        int[] nums1 = {73,74,75,71,69,72,76,73};
        int[] nums2 = {30,40,50,60};

        System.out.println(java.util.Arrays.toString(lc.dailyTemperatures(nums1)));
        System.out.println(java.util.Arrays.toString(lc.dailyTemperatures(nums2)));
    }

}

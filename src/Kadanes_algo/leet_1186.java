package Kadanes_algo;

public class leet_1186 {
    public int maximumSum(int[] arr) {
        int no_delete = arr[0];
        int one_delete = Integer.MIN_VALUE;
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prev_no_delete = no_delete;

            no_delete = Math.max(arr[i], no_delete + arr[i]);

            one_delete = Math.max(
                    one_delete == Integer.MIN_VALUE ? prev_no_delete : one_delete + arr[i],
                    prev_no_delete
            );

            res = Math.max(res, Math.max(no_delete, one_delete));
        }

        return res;
    }

    public static void main(String[] args) {

    }
}

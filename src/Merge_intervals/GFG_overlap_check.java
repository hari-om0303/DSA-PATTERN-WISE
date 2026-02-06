package Merge_intervals;

import java.util.Arrays;

public class GFG_overlap_check {
    public static boolean OverlapCheck(int[][] arr) {
        if (arr.length == 0) return false;
        Arrays.sort(arr , (a ,b ) -> a[0] - b[0]);
        int s1 = arr[0][0];
        int e1 = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            int s2 = arr[i][0];
            int e2 = arr[i][0];
            if (e1 >= s2) return true;
            s1 = s2;
            e1 = e2;
        }
        return false;
    }

    public static void main(String[] args) {
//        int [][] arr = {{1, 3}, {5, 7}, {2, 4}, {6, 8}}; //true
        int [][] arr = {{1, 3}, {7,9}, {4,6}, {10,13}};  //false
        System.out.println(OverlapCheck(arr));
    }
}

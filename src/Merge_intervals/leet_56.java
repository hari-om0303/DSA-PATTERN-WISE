package Merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet_56 {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
                continue;
            } else {
                res.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }
        res.add(new int[]{start1, end1});
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] ans = merge(arr);
        System.out.println(Arrays.deepToString(merge(ans)));
    }
}

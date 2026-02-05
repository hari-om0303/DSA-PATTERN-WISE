package Merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet_57 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][]{newInterval};

//        inserting new interval
        List<int[]> newarr = new ArrayList<>();
        boolean insert = false;
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (!insert  && start>newInterval[0]) {
                newarr.add(newInterval);
                insert = true;
            }
            newarr.add(intervals[i]);
        }
        if (!insert) {
            newarr.add(newInterval);
        }

//     merging intervals
        List<int []> res = new ArrayList<>();
        int start1 = newarr.get(0)[0];
        int end1 = newarr.get(0)[1];

        for (int i=1; i< newarr.size(); i++ ){
             int start2 = newarr.get(i)[0];
             int end2 = newarr.get(i)[1];
             if (start2<=end1){
                 end1 = Math.max(end1,end2);
                 continue;
             }
             res.add(new int[]{start1,end1});
             start1 = start2;
             end1 = end2;
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] inter = {4,8};
        int [][] ans = insert(arr ,inter);
        System.out.println(Arrays.deepToString(ans));
    }

}

//Given two arrays start[] and end[] such that start[i] is the starting time of ith meeting and end[i] is the ending time of ith meeting. Return the minimum number of rooms required to attend all meetings.
//
//        Note: A person can also attend a meeting if it's starting time is same as the previous meeting's ending time.
//
//        Examples:
//
//Input: start[] = [1, 10, 7], end[] = [4, 15, 10]
//Output: 1
//Explanation: Since all the meetings are held at different times, it is possible to attend all the meetings in a single room.
//Input: start[] = [2, 9, 6], end[] = [4, 12, 10]
//Output: 2
//Explanation: 1st and 2nd meetings at one room but for 3rd meeting one another room required.

package Merge_intervals;

import java.util.Arrays;

public class GFG_meeting_rooms_2 {
    public static int meeting(int start[] , int end []){
       Arrays.sort(start);
       Arrays.sort(end);
        int res =0 ;
        int room = 0;
        int i =0;
        int j =0;
        while (i< start.length && j< end.length){
            if (start[i]<end[j]){
                room++;
                res = Math.max(res , room);
                i++;
            }else {
                room--;
                j++;
            }
        }
        return  res;
    }

    public static void main(String[] args) {
//        ex 1
//        int [] start = {1,10,7};
//        int [] end = {4,15,10};
//        ex 2
        int [] start = {2,9,6};
        int [] end = {4,12,10};
        int ans = meeting(start,end);
        System.out.println(ans);
    }
}

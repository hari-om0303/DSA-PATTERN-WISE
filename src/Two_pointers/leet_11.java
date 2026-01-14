package Two_pointers;

public class leet_11 {
    public static int maxArea(int[] height) {
       int left = 0;
       int right = height.length-1;
       int maxarea = 0;
       while (left<right){
           int minhight = Math.min(height[left], height[right]);
           int currentarea = minhight*(right-left); //base = left-right
           maxarea = Math.max(maxarea, currentarea);
           if (height[left]<height[right]){
               left++;
           }else {
               right--;
           }
       }
       return maxarea;
    }

    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}

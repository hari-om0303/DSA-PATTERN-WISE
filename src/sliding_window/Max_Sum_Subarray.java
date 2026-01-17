package sliding_window;

public class Max_Sum_Subarray {
    public int subAarraysum(int [] arr , int k){
        int low = 0;
        int high = k-1;
        int sum = 0;
        for (int i = low; i<=high; i++ ){
            sum += arr[i];
        }
        int result = 0;
        while (high<arr.length){
            result = Math.max(result, sum);
            low++;
            high++;
            if (high == arr.length){
                break;
            }
            sum = sum-arr[low-1]+arr[high];
        }
        return result;
    }

    public static void main(String[] args) {
        Max_Sum_Subarray obj = new Max_Sum_Subarray();
        int [] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
       int ans =  obj.subAarraysum(arr, 4);
        System.out.println(ans);
    }

}
